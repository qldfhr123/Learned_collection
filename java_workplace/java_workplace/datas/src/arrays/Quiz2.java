package arrays;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int sum =0;
		String[] subject = new String[] {"국어","영어","수학"};
		int scores [] = new int[subject.length+1];
		int avg = 0;
		double Intavg = (int)avg;
		 for (int i=0; i<subject.length; i++) {
			 while (true) {
				 System.out.print(subject[i]+"점수");
					try {
						scores [i] = input1.nextInt();
					} catch (Exception e) {
						continue;
					}
					if (0 <= 3 && sum <= 100) {
						break;
					}
			 }
			 scores[subject.length] += scores [i];
	        }
 		Intavg = scores[subject.length]/subject.length;
		System.out.println("총점 : "+scores[subject.length]);
		System.out.println("평균 : "+Intavg);
		
	}
}
