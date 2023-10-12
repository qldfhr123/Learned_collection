package loopFor;

import java.math.BigInteger;

public class Quiz4 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		
		for(i=1;i<=1000;i++) {
			if(i%4 == 1 && i%6 == 1) {
				sum+=i;
			}
		}
		System.out.println("나머지가 1인 수의 합:"+sum);
		
		/*첫날1원 저축 다음날부터는 2배씩 증가 30일동안 저축금액 구하기*/
		int total=0;
		int money=1;
		for(i=1	;i<=30;i++) {
			total=total+money;
			money=money*2;
		}
		System.out.println("저축한 금액: "+total); //int으로 표현 힘듬
		
		/*
		  밀알 첫번째는 1개  두번째는 2개 세번째는 4개등으로 
		  총 64까지 밀알이 2배씩증가할때 총밀알의 합계구하기
		*/
		
		BigInteger mile = new BigInteger("1"); //BigInteger.one 으로 저장할수도있다
		BigInteger bonus = new BigInteger("2");
		BigInteger miletotal = new BigInteger("0");
		/*+bigNumber1.subtract(bigNumber2));뺼셈
		  +bigNumber1.divide(bigNumber2));나누기
		  +bigNumber1.remainder(bigNumber2)):나머지 
		   	데이터 		연산자		데이터
		 */
		for(i=1	;i<=64;i++) {
			miletotal = miletotal.add(mile);//BigInteger 계산방법 더하기 다시 저장해줘야한다
			mile = mile.multiply(bonus);//BigInteger 계산방법 곱하기
		}
		System.out.println("밀알의 총 갯수: "+miletotal);
		
	}

}
