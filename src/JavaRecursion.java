import java.util.Scanner;

public class JavaRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ingrese un indice de la secuencia de fibonacci: ");
		int input = sc.nextInt();

		System.out.print("El numero " + input + " de la secuencia de fibonacci es: " + fibonacci(input));
	}

//metodo para hallar numeros de la sec de fibonacci pero esta vez con recursividad
	public static int fibonacci(int i) {
		if (i == 0)
			return 0;
		else if (i == 1 || i == 2)
			return 1;
		else
			return fibonacci(i - 2) + fibonacci(i - 1);
	}
}
