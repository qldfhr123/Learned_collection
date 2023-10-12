package loopWhile;

import java.util.Random;

public class Exam4 {

	public static void main(String[] args) {
		Math.random();
		
		int begin=11;
		int end=30;
		for(int i=1; i<5;i++) {
		//System.out.println(Math.random());
		//System.out.println((int)Math.random()*10+10);//10~19
		//System.out.println((int)Math.random()*20);//10~19
		//System.out.println((int)Math.random()*(3788-21+1));//21~3788
		System.out.println((int)Math.random()*(end-begin+1)+begin);
		}
		Random r = new Random();
		r.nextBoolean();
		r.nextDouble();
		r.nextFloat();
		r.nextInt();
		r.nextLong();
		for(int i=0; i<5; i++) {
			System.out.println(r.nextInt(100));//0포함10까지
		}
	}
	

}
