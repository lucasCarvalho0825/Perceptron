package model;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Rede r = new Rede();
		 
		 System.out.println(" \n entre com a qtd de entradas para o Neurônio");
		 int qtdE = scanner.nextInt();
		 
		 int op = 0;
		 while( op == 0){
			 
			 System.out.println(" \n entre com as duas entradas da rede");
			 double[] entrada = new double[qtdE];
			 for(int i = 0; i<entrada.length; i++){
				 entrada[i] = scanner.nextDouble();
			 }
			 
			 System.out.println("a saida para as entradas é: " + r.sinapse(entrada));
			 
			 System.out.println(" \n para realizar um nv teste entre com 0");
			 op = scanner.nextInt();
		 }
		 
	 }
}
