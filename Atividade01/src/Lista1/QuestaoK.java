package Lista1;

import java.util.Scanner;

public class QuestaoK {

	public static void main(String[] args) {
		
		double media, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Informe outro n�mero: ");
		num2 = sc.nextInt();
		
		sc.close();

		media = (num1 + num2) / 2;
		
		System.out.println("Produto dos dois n�meros: "+media);
	}

}