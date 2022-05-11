import java.util.Scanner;

public class JavaSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"1. Saludo\n2. Ingrese 2 numeros para sumar\n"
					+ "3. Ingrese 2 numeros para restar\n4. Salir");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Buenos dias!");
				break;
			case 2:
				input = 0;
				input = sc.nextInt();
				input += sc.nextInt();
				System.out.println(input);
				break;
			case 3:
				input = 0;
				input = sc.nextInt();
				input -= sc.nextInt();
				System.out.println(input);
				break;
			case 4:
				System.out.println("Vuelva pronto!");
				System.exit(0);
				break;
			}
		}
	}
}
