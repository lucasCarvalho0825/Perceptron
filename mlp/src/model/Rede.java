package model;

import java.util.Scanner;

public class Rede {
	
	//Neurônio 
	private Neuronio perceptron;
	//base de dados da rede
	private Base_de_Dados  dados;
	private double[][] conhecimento;
	
	//Erro
	private double e;
	//Taxa de aprendizado
	private double n;
	//epocas
	private int ep;
	
	public Rede(){
		
		//carregando base de dados
		this.dados = new Base_de_Dados();
		conhecimento = dados.getEntrada();
		//instanciando neurônio
		this.perceptron = 
				new Neuronio(conhecimento[0].length);
		
		this.n = 1;	
		this.ep = 0;
		
		aprendizado_supervisionado();
		
	}
	
	
	//sinapse -> processo de ativação 
    public double sinapse(double[] entrada){
        perceptron.setX(entrada);
        return perceptron.degrau(
        		perceptron.somatorio());
    }
    
    
    private void aprendizado_supervisionado() {

    	int erro = 1;
    	double[] desejada = dados.getSaida();

    	while(erro != 0 ){
    		
    		erro = 0;
    		System.out.println(++ep);
    		
    		for(int i=0; i<conhecimento.length; i++){
    			
    			double y = sinapse(dados.exemplo(i));
    			//System.out.println(perceptron.toString());
    			
    			e = desejada[i] - y;
    			//System.out.println(" "+desejada[i] +" - "+ y +" = "+ e);

    			if(e != 0){
    				erro++;
    				this.perceptron.atualizaPeso(e, n);
    			}	 
    		}
    		System.out.println("epóca: "+ ep+" qtd erros: " + erro);
    		
    	};
    	
    	System.out.println(" \n rede treinada! ;) ");
    	
    	System.out.print(" W finais: "); perceptron.getW();
    	System.out.println(" bias: "+perceptron.getBias() +" Wbias: " +perceptron.getWb()); 
    }
}
