package arrays;

import java.util.Random;
import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.입실 \n2.퇴실 \n3.전체보기 \n4.종료");
			System.out.print(">> ");
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (select) {
			case 1: System.out.println("입실 호수 선택 : ");
					int room = sc.nextInt();
					System.out.println("입실자 이름 입력");
					String name = st.next();
					
					
					int row = 0;
					for(row=1; row<3;row++) {
					int [][]floor = new int[row][room];
					//String []arr = new String[];//층마다 방개수	   
					}
					break;
				
			case 2: /*int []arr = new int[room];
					System.out.println("==== 입주자 정보 ====");
					for(int i=0; i<arr.length; i++) {
				   for(int j=0; j<arr[i]; j++) {
				    //System.out.println((i+1)+"층 "+(j+1)+"호실 입주자: "+arr[i][j]+"");
				   }
				  }*/
					break;
			
			case 3:System.out.println();break;
	
			default :System.out.println("확인 후 다시 입력하세요.");
			}
		}

	}

}
