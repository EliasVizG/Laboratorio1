import java.util.Random;
import java.util.Scanner;

public class JavaWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int randomNum = rd.nextInt(10) + 1;
		int input = 0;
		System.out.println(">>Adivine el numero del 1 al 10 para ganar<<");
		input = sc.nextInt();
		while (randomNum != input) {
			System.out.println("Intentelo de nuevo!");
			input = sc.nextInt();
		}
		System.out.println("Bingo!");
	}
}
