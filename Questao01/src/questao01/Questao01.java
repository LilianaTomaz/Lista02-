// Quest�o 01 - Fazer um programa que recebe um s�mbolo de opera��o do usu�rio (+, -, / ou *) e dois n�meros reais. O programa 
// deve retornar o resultado da opera��o recebida sobre estes dois n�meros.

package questao01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha qual opera��o voc� deseja fazer: ");
		char op = in.next().charAt(0);
		System.out.println("Digite um n�mero real: ");
		float n1 = in.nextFloat();
		System.out.println("Digite outro n�mero real: ");
		float n2 = in.nextFloat();
		
		if (op == '+') {
			float s = (n1+n2);
			System.out.println("O valor de "+n1+" + "+n2+" �: "+s);
		} if (op == '-') {
			float su = (n1 - n2);
			System.out.println("O valor de "+n1+" - "+n2+" �: "+su);
		} if (op == '/') {
			float d = (n1 / n2);
			System.out.println("O valor de "+n1+" / "+n2+" �: "+d);
		} if (op == '*') {
			float m = (n1 * n2);
			System.out.println("O valor de "+n1+" * "+n2+" �: "+m);
		}
		

	}

}