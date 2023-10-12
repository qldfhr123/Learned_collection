package loopWhile;

public class Quiz2 {

	public static void main(String[] args) {
		int rice=102000;//102kg > 102000g으로 변경
		int time=0;
		int mouse=2;
		int eat = 20;
		
		while(true) {
			time++;
			rice=rice-(mouse*eat);
			if(rice<=0) {
				break;
			}
			
			if(time%10==0) 
				mouse*=2;	
		}
		System.out.println(mouse+"마리입니다");
	
	int sum=0;
	int num=1;
	while(true) {
		if(num % 2 == 1) { 
			sum = sum + num * (num+1);
		}
		else { 
			sum = sum - num * (num+1);
		}
		if(sum > 100)
			break;
		num++;
	}
	System.out.println( "마지막 두 수 : " + num + "," + (num+1));

	
	}
}




