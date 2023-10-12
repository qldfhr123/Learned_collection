package arrays;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dataCount = 0;
		int[] arr = new int[3];
		while(true) {
			for(int i = dataCount; i < arr.length; i++) {
				int iTmp;
				while(true) {
					try {
						System.out.print("입력(현재길이:" + arr.length + ") : ");
						iTmp = sc.nextInt();
					} catch (Exception e) {
						sc.nextLine();
						continue;
					}
					
					boolean result = true;
					for(int j = 0; j < dataCount; j++) {
						if(arr[j] == iTmp) {
							System.out.println("중복!");
							result = false;
							break;
						}
					}
					if(result) {
						arr[i] = iTmp;
						break;
					}
				}
				
				dataCount++;
				for(int j = 0; j < dataCount;j++)
					System.out.print(arr[j] + ",");
				System.out.println();
			}
			
			int[] tmp = arr;
			arr = new int[dataCount+3];
			
			for(int i = 0; i < tmp.length; i++) {
				arr[i] = tmp[i];
			}
			
		}
	}

}
