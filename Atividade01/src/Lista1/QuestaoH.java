package Lista1;

import java.util.Scanner;

public class QuestaoH {

	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Informe outro n�mero: ");
		num2 = sc.nextInt();
		
		sc.close();

		soma = num1 + num2;
		
		System.out.println("Soma = "+soma);
	}

}
