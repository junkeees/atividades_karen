package Lista1;

import java.util.Scanner;

public class QuestaoO {

	public static void main(String[] args) {

		double base, alt, area;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a base do tri�ngulo: ");
		base = sc.nextInt();
		System.out.print("Informe a altura do tri�ngulo: ");
		alt = sc.nextInt();

		sc.close();

		area = (base * alt) / 2;
		
		System.out.println("�rea do tri�ngulo: "+area);

	}

}
