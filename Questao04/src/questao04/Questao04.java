// Questão 04 - Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. Termine a 
// leitura se o usuário digitar zero (0).

package questao04;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n1 = in.nextInt();
		
		if  (n1 == 0) {
			System.out.println("Nenhum número par foi digitado.");
		}
		if (n1 != 0) {
			if (n1%2==0) {
			System.out.println("Digite outro número inteiro: ");
			int n2 = in.nextInt();
			if (n2 != 0) {
				if (n2%2 == 0) {
				int media = (n1+n2)/2;
				System.out.println("A média dos números digitados é: "+media);
				} else  {
				System.out.println("Nenhum número par digitado.");
			}
		
			} 
			
			
			}
		
		}
		
		
		
	}
}