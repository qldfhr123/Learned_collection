package loopFor;

public class Exam4 {

	public static void main(String[] args) {
		int i=1;
		for(; ; ) {
			i++;
			if(i==416) {
				break;
			}
		}
		i = 1;
		for(;i!=416;i++) { //조건식이 없으면 true, 무한반복
			System.out.println(i);
		}
		
		}	

	}


