import java.util.Scanner;

public class JavaMath {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el valor de los 2 catetos de un triangulo: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("El cateto mayor es: " + Math.max(num1, num2));
		System.out.println("El cateto menor es: " + Math.min(num1, num2));
		System.out.println("La hipotenusa del triangulo es: " + Math.hypot(num1, num2));

	}
}
