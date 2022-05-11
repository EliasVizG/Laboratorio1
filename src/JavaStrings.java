import java.util.Scanner;

public class JavaStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese una cadena u oracion: ");
		String input = sc.nextLine();

		System.out.println("Su cadena tiene " + input.length() + " caracteres");
		System.out.println("Todo en mayusculas seria: " + input.toUpperCase());
		System.out.println("El indice de la primera /'a/' es: " + input.indexOf("a"));

		System.out.print("Ingrese otra cadena u oracion: ");
		String input1 = sc.nextLine();
		System.out.println("Ambas cadenas unidas serian: " + input.concat(input1));
		System.out.println("Las separaremos con un slash: " + input + "\\" + input1);
	}
}
