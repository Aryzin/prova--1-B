package ifsc;

import java.util.Scanner;

public class ProvaBMain {

	public static int mm(int vetor, int maior) {
		int vet[] = new int[6];
		for (int i = 0; i < vet.length; i++) {
			 vet[i]=vetor;
			 
			 if (vet[i] >= maior) {
					maior = vet[i];
				}
		};
		
		return maior;
	}
	
	
	public static int mn(int vetor, int menor) {
		int vet[] = new int[6];
		for (int i = 0; i < vet.length; i++) {
			 vet[i]=vetor;
			 
			 if (vet[i] <= menor) {
					menor = vet[i];
				}
		};
		
		return menor;

	}

	// return mm;
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[6];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] < 0) {
				System.out.println("Digite um valor valido");
				i--;
			}
		}
		int maior = 0;
		int menor = 999;

		for (int i = 0; i < vetor.length; i++) {
			
			maior = mm(vetor[i], maior);
			menor = mn(vetor[i], menor);
		}

		System.out.println("Maior--> " + maior);
		System.out.println("Menor--> " + menor);
	}
}
