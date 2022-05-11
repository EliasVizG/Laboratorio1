import java.util.Scanner;

public class JavaBoolean {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese  2 valores: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean isEqual = num1 == num2;

		if (isEqual)
			System.out.println("Ingreso el mismo numero");
		else
			System.out.println("Ingreso diferentes numeros");
	}
}
