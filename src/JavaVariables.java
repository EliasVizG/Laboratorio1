import java.util.Scanner;

public class JavaVariables {

	public static void main(String[] args) {

		final String name;
		name = "Alberto";
		String surname = "Fernandez";
		int age, sameAge;
		age = sameAge = 31;
		double ageWithDecimals = 31.76;
		char sex = 'M';
		boolean married = false;
		String civilState = (married == true) ? "Casado" : "Single";

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese 1 para mostrar los datos de Alberto: ");
		String choice = sc.nextLine();

		if (choice.equals("1"))
			System.out
					.println(name + " " + surname + ", age: " + age + ", sex: " + sex + ", Civil state: " + civilState);
		else
			System.out.println("No quiere saber sobre Alberto");

	}
}
