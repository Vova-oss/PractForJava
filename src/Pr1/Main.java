package Pr1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	while (true) {
			System.out.println("Выберете номер: 3, 4, 5");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
				case 3:
					new num3();
					break;
				case 4:
					new num4();
					break;
				case 5:
					new num5();
					break;
				default:
					System.out.println("Вы ввели неправильный номер. Повторите попытку.");
					break;
			}
		}
    }
}
