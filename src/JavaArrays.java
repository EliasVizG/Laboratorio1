//Tabla de multiplicar de 10x10
public class JavaArrays {

	public static void main(String[] args) {

		int[][] multiplyTable = new int[11][11];

		for (int i = 1; i < multiplyTable.length; ++i) {
			for (int j = 1; j < multiplyTable[i].length; ++j) {
				multiplyTable[i][j] = i * j;
				System.out.print(multiplyTable[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
