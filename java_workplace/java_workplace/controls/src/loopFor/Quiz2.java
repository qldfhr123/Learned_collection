package loopFor;

public class Quiz2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i<=1000; i++) {
			if(i %3!=0) {
				sum=sum+i;
			}
			else if(i % 5==0) { //i %3 ==0 은 생략 가능 위에 if에서 거짓으로 구분해서 else if들어온다
				sum=sum+i;
			}
		}
		System.out.println("합계: "+sum);
		
		
		int odd =0;
		int summ = 0;
		for(odd=1;summ<10000;odd++) { //i+=2 홀수 표현가능하다
			if(odd % 2 != 0) {
                summ=summ+odd;
            }
		}
		odd--; //i++ 증가 연산에 들어가있기때문에 빼줘야한다
		System.out.println("마지막 홀수는: "+odd);
       
	}
}
