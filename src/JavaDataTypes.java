import java.util.Scanner;

public class JavaDataTypes {
	public static void main(String[] args) {
		byte smallNum = 100;
		short mediumNum = 32767;
		int largeNum = 2100000000;
		long enormousNum = 9223372000000000L;
		float fractionalSmallNum = 4.78433f;
		double fractionalNum = 38.34533636378d;
		double scientificNum = 25e6d;
		boolean areNumbersFun = true;
		char dollarSign = '$';
		char aInCaptions = 65;

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String emptyValue = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese 1 para mostrar los posibles tipos de datos de java: ");
		String choice = sc.nextLine();
		if (choice.equals("1")) {
			System.out.println(smallNum);
			System.out.println(mediumNum);
			System.out.println(largeNum);
			System.out.println(enormousNum);
			System.out.println(fractionalSmallNum);
			System.out.println(fractionalNum);
			System.out.println(scientificNum);
			System.out.println(areNumbersFun);
			System.out.println(dollarSign);
			System.out.println(aInCaptions);
			System.out.println(alphabet);
			System.out.println(emptyValue);
		} else
			System.out.println("No quiere aprender sobre los tipos de datos");
	}
}
