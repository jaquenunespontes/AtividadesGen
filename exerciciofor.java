package ExercicioRepeticao;

public class exerciciofor {
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
				System.out.printf("\nMedia: %3.2f",media);
				somaMedia += media; // somaMedia = somaMedia + media
			}
			mediaGeral = somaMedia / 4;
			System.out.println("\nMedia Geral: "+mediaGeral);

		}

	}

}
