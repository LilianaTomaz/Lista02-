// Quest?o 03 - Escreva um algoritmo estruturado que gere os n?meros de 1000 a 1999 e escreva somente os n?meros que s?o 
// divis?veis por 11 e cujo resto ? 5

package questao03;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("N?meros entre '1000 a 1999' que s?o divis?veis por 11 e o resto ? 5: ");
		for (int i=1000; i < 2000; i++){
		    if (i%11==5) {
		        System.out.println(i);
		    }
		}

	}

}