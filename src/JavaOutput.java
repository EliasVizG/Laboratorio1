import java.util.Scanner;

public class JavaOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese 1 para aprender matematicas: ");
		String choice = sc.nextLine();

		if (choice.equals("1"))
			System.out.println("7 + 8 * 9 = " + (7 + 8 * 9));
		else
			System.out.println("No quiere aprender matematicas");

	}
}
