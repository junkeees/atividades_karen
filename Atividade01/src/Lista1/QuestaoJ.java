package Lista1;

import java.util.Scanner;

public class QuestaoJ {

	public static void main(String[] args) {
		
		int num, terca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		num = sc.nextInt();
		
		sc.close();
		
		terca = num / 3;

		System.out.println("A ter�a parte desse n�mero �: "+terca);
	}

}
