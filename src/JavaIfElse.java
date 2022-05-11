import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese  2 valores diferentes:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		String output = (num1 == num2) ? "Ingreso el mismo numero"
				: ((num1 < num2) ? "El primer numero es menor" : "El primer numero es mayor");

		System.out.println(output);

	}
}
