package loopFor;

import java.util.Scanner;

public class Quiz8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j, line, star, space;
		
		System.out.print("입력 : ");
		line = sc.nextInt();
		space = 1;
		star = line / 2;
		
		for (i = 0; i < line; i++) {
			for (j = 0; j < star; j++)
				System.out.print("*");
			
			for (j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < star; j++)
				System.out.print("*");
			
			System.out.println();
			if(i < line / 2) {
				space += 2;
				star--;
			}else {
				space -= 2;
				star++;
			}
		}

	}
}