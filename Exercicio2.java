package ExercicioRepeticao;

public class Exercicio2 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num,x=1,contPar=0,contImpar=0;
		
		while(x<=10) {
			
			System.out.println("\nEntre com qualquer nuero: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				contPar++;// contPar = contPar + 1
				//System.out.println("\nEsse numero é par...");
			}
			else
			{
				contImpar++;
				//System.out.println("\nEsse numero é ímpar...");
			}
			x++;
		}
		System.out.println("\nQuantidade de numeros pares é: "+contPar);
		System.out.println("\nQuantidade de numeros ímpares é: "+contImpar);

	}

}

}
