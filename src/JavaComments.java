//Ejercicio de uso de comentarios en java

import java.util.Scanner;

public class JavaComments {

	public static void main(String[] args) {

		// la clase Scanner sirve para interactuar con el programa
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese 1 para aprender matematicas: ");
		String choice = sc.nextLine();

		/*
		 * Tambien se pueden hacer comentarios en varias lineas de esta forma
		 */

		if (choice.equals("1"))
			System.out.println("7 + 8 * 9 = " + (7 + 8 * 9));
		else
			System.out.println("No quiere aprender matematicas");
	}
}
