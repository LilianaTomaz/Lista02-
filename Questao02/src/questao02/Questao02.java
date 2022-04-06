// Questão 02 - Construir um algoritmo para calcular e apresentar a soma de vários valores inteiros e positivos, fornecidos pelo 
// teclado, o último valor deve ser -1 (flag) e não deve ser considerado

package questao02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite '-1' se desejar encerrar o programa! ");
		
		int num, soma = 0;
        do{
            System.out.println("Digite um número inteiro e positivo: ");
            num = in.nextInt();
            
            if(num >= 0){ 
                soma = num + soma; 
            }
        } while( num != -1 );
        
        System.out.println("A soma é " + soma);
    }
}	