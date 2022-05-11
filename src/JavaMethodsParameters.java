import java.util.Scanner;

public class JavaMethodsParameters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ingrese un indice de la secuencia de fibonacci: ");
		int input = sc.nextInt();
		System.out.print("El numero " + input + " de la secuencia de fibonacci es: " + fibonacci(input));
	}

	public static int fibonacci(int index) {
		int fibonacci = 0;
		int a = 1;
		for (int i = 0; i < index; i++) {
			int temp = fibonacci;
			fibonacci = fibonacci + a;
			a = temp;
		}
		return fibonacci;
	}
}
