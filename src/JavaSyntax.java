import java.util.Scanner;

public class JavaSyntax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese 1 para un saludo: ");
		String choice = sc.nextLine();

		if (choice.equals("1"))
			System.out.println("Hola mundo!");
		else
			System.out.println("Adios mundo!");

	}
}
