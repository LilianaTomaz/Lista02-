// Quest�o 04 - Escreva um algoritmo que calcule a m�dia dos n�meros digitados pelo usu�rio, se eles forem pares. Termine a 
// leitura se o usu�rio digitar zero (0).

package questao04;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int n1 = in.nextInt();
		
		if  (n1 == 0) {
			System.out.println("Nenhum n�mero par foi digitado.");
		}
		if (n1 != 0) {
			if (n1%2==0) {
			System.out.println("Digite outro n�mero inteiro: ");
			int n2 = in.nextInt();
			if (n2 != 0) {
				if (n2%2 == 0) {
				int media = (n1+n2)/2;
				System.out.println("A m�dia dos n�meros digitados �: "+media);
				} else  {
				System.out.println("Nenhum n�mero par digitado.");
			}
		
			} 
			
			
			}
		
		}
		
		
		
	}
}