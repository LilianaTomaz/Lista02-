//Escreva um algoritmo que leia os tr�s lados de um tri�ngulo (A, B, C) e que determine e imprima uma mensagem 
// informando o seu tipo, Equil�tero = 3 lados iguais, Is�sceles = 2 lados iguais, Escaleno = 3 lados diferente

package questao05;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do primeiro lado do tri�ngulo? ");
		float l1 = in.nextFloat();
		System.out.println("Qual o valor do segundo lado do tri�ngulo? ");
		float l2 = in.nextFloat();
		System.out.println("Qual o valor do terceiro lado do tri�ngulo? ");
		float l3 = in.nextFloat();
		
		if (l1 == l2 && l1 != l3) {
			System.out.println("O tri�ngulo � Is�celes(Dois lados iguais).");
		} if (l1 == l3 && l2 != l3) {
			System.out.println("O tri�ngulo � Is�celes(Dois lados iguais).");
		} if (l1 == l3 && l2 == l3 && l1 == l3) {
			System.out.println("O tri�ngulo � Equil�tero(Tr�s lados iguais).");
		} if (l1 != l2 && l2 != l3 && l1 != l3) {
			System.out.println("O tri�ngulo � Escaleno(Tr�s lados diferentes)."); 
		}

	}

}