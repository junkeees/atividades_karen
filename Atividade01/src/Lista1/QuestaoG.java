package Lista1;

import java.util.Scanner;

public class QuestaoG{

	public static void main(String[] args) {
		
		long telefone;
		String nome, endereco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = sc.next();
		System.out.print("Informe seu endere�o: ");
		endereco = sc.next();
		System.out.print("Informe seu telefone: ");
		telefone = sc.nextLong();
		
		sc.close();
		
		System.out.println("Ol� "+nome+"\nSeu telefone �: "+telefone+"\nSeu endere�o �: "+endereco);

	}

}
