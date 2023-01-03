package ExercicioRepeticao;

public class ForWhiledoWhile {
	
	import java.util.Scanner;

	public class LacoDoWhile {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int tabuada,x=1,resultado;
			
			System.out.println("\nEntre com a tabuada que deseja: ");
			tabuada = leia.nextInt();
			do
			{
				resultado = tabuada * x;
				System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
				x++;
			}while(x<=10);

		}

	} 
	import java.util.Scanner;

	public class LacoWhile {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int num,x=1,contPar=0,contImpar=0;
			
			while(x<=10) {
				
				System.out.println("\nEntre com qualquer numero: ");
				num = leia.nextInt();
				
				if(num % 2 == 0) {
					contPar++;// contPar = contPar + 1
					//System.out.println("\nEsse número é par...");
				}
				else
				{
					contImpar++;
					//System.out.println("\nEsse número é ímpar...");
				}
				x++;
			}
			System.out.println("\nQuantidade de pares é: "+contPar);
			System.out.println("\nQuantidade de ímpares é: "+contImpar);

		}

	}

}
package DesenvolvimentoJava;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		int x;
		
		for(x=1;x<=4;x++) {
			System.out.println("\nEntre com a 1º nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a 2º nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a 3º nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia: %3.2f",media);
			somaMedia += media; // somaMedia = somaMedia + media
		}
		mediaGeral = somaMedia / 4;
		System.out.println("\nMédia Geral: "+mediaGeral);

	}

}
