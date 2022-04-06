// Questao 06 - Escreva um programa que calcule o sal�rio semanal de um trabalhador. As entradas s�o o n�mero de horas trabalhadas
// na semana e o valor da hora. At� 40 h/semana n�o se acrescenta nenhum adicional. Acima de 40h e at� 60h h� um b�nus de 50% para
// essas horas. Acima de 60h h� um b�nus de 100% para essas horas.

package questao06;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o total de horas trabalhadas na semana? ");
		double h = in.nextInt();
		System.out.println("Qual o valor da hora? ");
		double vh = in.nextFloat();
		
		double ss = (h*vh);
		
		if (h <= 40) {
			System.out.printf("O seu sal�rio semanal n�o ter� b�nus e ser� R$ %.2f",ss);			
		} if (h > 40 && h <= 60 ) {
			double sf1 = (ss *0.50) + ss;
			System.out.printf("O seu sal�rio semanal ter� b�nus de 50 por cento e ser� R$ %.2f",sf1);
		} if (h > 60) {
			double sf2 = (ss * 0.100) + ss;
			System.out.printf("O seu sal�rio semanal ter� b�nus de 100 por cento e ser� R$ %.2f",sf2);
		}

	}

}