package arrays;

import java.util.Random;

public class Quiz9 {

	public static void main(String[] args) {
		int[][] lottos = new int[5][6];
		Random r = new Random();

		for (int row = 0; row < lottos.length; row++) {
			for (int i = 0; i < lottos[row].length; i++) {
				lottos[row][i] = r.nextInt(45) + 1; // 1 ~ 45
				for (int j = 0; j < i; j++) {
					if (lottos[row][j] == lottos[row][i]) {
						i--;
						break;
					}
				}
			}
			
			for (int i = 0; i < lottos[row].length - 1; i++) {
				for (int j = i + 1; j < lottos[row].length; j++) {
					if (lottos[row][i] > lottos[row][j]) {
						int tmp = lottos[row][j];
						lottos[row][j] = lottos[row][i];
						lottos[row][i] = tmp;
					}
				}
			}
		}
		for (int col = 0; col < lottos.length; col++) {
			for (int j = 0; j < lottos[col].length; j++) {
				lottos[col][j] = r.nextInt(45) + 1; // 1 ~ 45
				for (int i = 0; i < j; i++) {
					if (lottos[col][j] == lottos[col][i]) {
						i--;
						break;
					}
				}
			}
			
			for (int j = 0; j < lottos[col].length - 1; j++) {
				for (int i = j + 1; i < lottos[col].length; i++) {
					if (lottos[col][j] > lottos[col][i]) {
						int tmp = lottos[col][i];
						lottos[col][i] = lottos[col][j];
						lottos[col][j] = tmp;
					}
				}
			}
		}
		System.out.println("## 결과 ##");
		for (int row = 0; row < lottos.length; row++) {
			for (int j = 0; j < lottos[row].length; j++)
				System.out.printf("%02d ", lottos[row][j]);
			System.out.println();
		}
	}
}
