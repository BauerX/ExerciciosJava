// mostre 4 notas dos alunos e mostre a média de notas

package exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Nota do Aluno1");
	float aluno1 = scan.nextFloat();
	System.out.println("Nota do Aluno2");
	float aluno2 = scan.nextFloat();
	System.out.println("Nota do Aluno3");
	float aluno3 = scan.nextFloat();
	System.out.println("Nota do Aluno4");
	float aluno4 = scan.nextFloat();
	
	float resultado = aluno1 + aluno2 + aluno3 + aluno4 / 4;
	
	System.out.println("A média de notas é: " + resultado);
	
	
	

	}

}
