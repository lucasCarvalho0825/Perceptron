package model;

import java.util.Arrays;

public class Base_de_Dados {

	private double[][] entrada;
	private double[] saida;
	
	public Base_de_Dados() {
		
		this.entrada = new double[4][2];
		entrada[0][0] = 0;  
		entrada[0][1] = 0;
		entrada[1][0] = 0;
		entrada[1][1] = 1;
		entrada[2][0] = 1;
		entrada[2][1] = 0;
		entrada[3][0] = 1;
		entrada[3][1] = 1;
			
		// para o teste AND
		this.saida = new double[4];
		saida[0] = 0;
		saida[1] = 0;
		saida[2] = 0;
		saida[3] = 1;
       
		// para o teste OR
		/*this.saida = new double[4];
		saida[0] = 1;
		saida[1] = 1;
		saida[2] = 1;
		saida[3] = 0;*/
	}

	public double[][] getEntrada() {
		return entrada;
	}

	public void setEntrada(double[][] entrada) {
		this.entrada = entrada;
	}

	public double[] getSaida() {
		return saida;
	}

	public void setSaida(double[] saida) {
		this.saida = saida;
	}

	public void tostring(double[] temp) {
		for(int i=0; i<temp.length; i++){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
	
	public double[] exemplo(int linha){

		double[] temp = 
   			 new double[entrada[0].length];
   	 
   	 for(int i=0; i<temp.length; i++){
   		temp[i] = entrada[linha][i];
   	 }
 
   	 return temp;
	}
	
}