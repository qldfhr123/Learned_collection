package loopFor;

public class Quiz5 {

	public static void main(String[] args) {
		int i,j;
		
		
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++)
				System.out.println(+i+" X "+j+ " = " +(i*j));
			System.out.println();
		}
		//디버깅:버그잡는용도 문법 에러x
		/*디버깅순서
		 * 1.브레이크 포인트 설정(Ctrl+Shift+b)
		 * 2.디버깅 시작(F11)
		 * 3.한줄씩 실행(F6)
		 * 4.디버깅 종료 (Ctrl+F2)
		 */
	}

}
