
// Exercicio 3 - mostrar 2 numeros e a soma

package exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?: ");
		int idade = scan.nextInt();
		
		System.out.println("Qual a idade da sua esposa: ");
		int idade2 = scan.nextInt();
		
		int resultado = idade + idade2;
		System.out.println("A sua idade somada a da sua esposa é: " + resultado);
		
	
		
		
	
	
		
	

	}

}
