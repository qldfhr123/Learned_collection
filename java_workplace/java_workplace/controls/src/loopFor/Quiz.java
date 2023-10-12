package loopFor;

public class Quiz {
	public static void main(String[] args) {
		String text = "hello" ;
		for(int i = 1; i<=4; i++) {
			System.out.println(i+"." +text);
		}
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum = sum+i;
			if (sum == 528) {
				System.out.println ("합: "+sum+ " 반복횟수: "+i);
			}
		}
		
		for(int i = 1; i<=25; i++) {
			System.out.print(i+"\t");
			if (i % 5==0) {
				System.out.print("\n");
			}
			
		}
	}
}
