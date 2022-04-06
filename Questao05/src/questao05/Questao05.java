//Escreva um algoritmo que leia os três lados de um triângulo (A, B, C) e que determine e imprima uma mensagem 
// informando o seu tipo, Equilátero = 3 lados iguais, Isósceles = 2 lados iguais, Escaleno = 3 lados diferente

package questao05;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do primeiro lado do triângulo? ");
		float l1 = in.nextFloat();
		System.out.println("Qual o valor do segundo lado do triângulo? ");
		float l2 = in.nextFloat();
		System.out.println("Qual o valor do terceiro lado do triângulo? ");
		float l3 = in.nextFloat();
		
		if (l1 == l2 && l1 != l3) {
			System.out.println("O triângulo é Isóceles(Dois lados iguais).");
		} if (l1 == l3 && l2 != l3) {
			System.out.println("O triângulo é Isóceles(Dois lados iguais).");
		} if (l1 == l3 && l2 == l3 && l1 == l3) {
			System.out.println("O triângulo é Equilátero(Três lados iguais).");
		} if (l1 != l2 && l2 != l3 && l1 != l3) {
			System.out.println("O triângulo é Escaleno(Três lados diferentes)."); 
		}

	}

}