package Lista1;

import java.util.Scanner;

public class QuestaoI {

	public static void main(String[] args) {
		
		int num1, num2, prod;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Informe outro n�mero: ");
		num2 = sc.nextInt();
		
		sc.close();

		prod = num1 * num2;
		
		System.out.println("Produto dos dois n�meros: "+prod);
	}

}