package model;

import java.util.Arrays;

public class Neuronio {

	//entradas dos neurônios
    private double[] x;
    //pesos das entradas
    private double[] w;

    private double bias;
    private double Wb;
    
    public Neuronio(int qtdEntradas){
    	
         this.x = new double[qtdEntradas];
         this.w = new double[qtdEntradas];
         //inicializando os pesos
         for(int i=0; i< qtdEntradas; i++){
             this.w[i] = 0;
         }
         
         
         this.bias = 1;
         this.Wb = 0;
     }
    
    // e = erro calculado
    // n = taxa de aprendizado da rede
    public void atualizaPeso(double e, double n){
       
    	for(int i=0; i< w.length; i++){
            w[i] = w[i] + ( n * e * x[i] );
        }
    	
    	bias = bias + ( n * e);
    }

    public double somatorio(){
        double u = 0;
        for(int i=0; i< this.x.length; i++){
            u += (x[i] * w[i])+ bias;
        }
        return u;
    }

    //função de ativação
    public int degrau(double u){
        if(u > 0){
        	return 1;
        }else{
        	return 0;
        }
        
    }
    
    public void getX() {
    	for (double d : w) {
			System.out.print(d+ " ");
		}
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public void getW() {
    	
    	for (double d : w) {
			System.out.print(d+ " ");
		}
        //return w;
    }

    public void setW(double[] w) {
        this.w = w;
    }

	public double getBias() {
		return bias;
	}

	public void setBias(double bias) {
		this.bias = bias;
	}

	public double getWb() {
		return Wb;
	}

	public void setWb(double wb) {
		Wb = wb;
	}

	@Override
	public String toString() {
		return "Neuronio [x=" + Arrays.toString(x) + ", w=" + Arrays.toString(w) + ", bias=" + bias + ", Wb=" + Wb
				+ "]";
	}

	
}
