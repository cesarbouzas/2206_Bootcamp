package principal;

import java.util.Scanner;

public abstract class Teclado {
	public static  int leerInt() {
		return new Scanner(System.in).nextInt();
	}
	public static String leerString() {
		 return new Scanner(System.in).nextLine();
	}

}
