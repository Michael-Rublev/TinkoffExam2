import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		long[][] matrica = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrica[i][j] = scanner.nextLong();
			}
		}
		
		long[][] rotationMatrix = new long[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				rotationMatrix[i][j] = matrica[n - j - 1][i];
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rotationMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
