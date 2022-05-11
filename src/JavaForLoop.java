import java.util.Random;

public class JavaForLoop {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] numbers = new int[30];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = rd.nextInt(100);

		for (int num : numbers)
			System.out.print(num + " ");
	}
}
