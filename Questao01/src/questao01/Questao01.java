// Questão 01 - Fazer um programa que recebe um símbolo de operação do usuário (+, -, / ou *) e dois números reais. O programa 
// deve retornar o resultado da operação recebida sobre estes dois números.

package questao01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha qual operação você deseja fazer: ");
		char op = in.next().charAt(0);
		System.out.println("Digite um número real: ");
		float n1 = in.nextFloat();
		System.out.println("Digite outro número real: ");
		float n2 = in.nextFloat();
		
		if (op == '+') {
			float s = (n1+n2);
			System.out.println("O valor de "+n1+" + "+n2+" é: "+s);
		} if (op == '-') {
			float su = (n1 - n2);
			System.out.println("O valor de "+n1+" - "+n2+" é: "+su);
		} if (op == '/') {
			float d = (n1 / n2);
			System.out.println("O valor de "+n1+" / "+n2+" é: "+d);
		} if (op == '*') {
			float m = (n1 * n2);
			System.out.println("O valor de "+n1+" * "+n2+" é: "+m);
		}
		

	}

}