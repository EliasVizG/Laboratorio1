import java.util.Random;

public class JavaBreakContinue {

	public static void main(String[] args) {
		Random rd = new Random();
		int random;
		int[] numbers = new int[50];

		for (int i = 0; i < numbers.length; i++) {
			random = rd.nextInt(100);
			// si el valor aleatorio es 0, se detiene la generacion de numeros
			if (random == 0)
				break;
			// si el valor es par, insiste hasta encontrar un numero impar o 0
			if (random % 2 == 0) {
				i--;
				continue;
			}
			numbers[i] = random;
		}
		for (int i : numbers)
			System.out.print(i + " ");
	}
}
