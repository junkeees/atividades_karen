package Lista1;

import java.util.Scanner;

public class QuestaoM {

	public static void main(String[] args) {
		
		int base, alt, peri, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a base do ret�ngulo: ");
		base = sc.nextInt();
		System.out.println("Informe a altura do ret�ngulo: ");
		alt = sc.nextInt();
		
		sc.close();
		
		peri = (base * 2) + (alt * 2);
		
		area = base * alt;
		
		System.out.println("Per�metro: "+peri+"\n�rea: "+area);

	}

}
