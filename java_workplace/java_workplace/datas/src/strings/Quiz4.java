package strings;

public class Quiz4 {

	public static void main(String[] args) {
		String data = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		
		String space[] = data.split("-"); //문자열을 "-" 기준으로 나눔.
		int[] num = new int[space.length];  
		int i;
		//반복문을 이용한 정수 추출과정
		for(i = 0; i < space.length; i++) {
			String tmp = "";
			for(int j = 0; j < space[i].length(); j++) {
				if(space[i].charAt(j) >= '0' && space[i].charAt(j) <= '9')
					tmp += space[i].charAt(j);// 2+8+3 = 283
			}
			num[i] = Integer.parseInt(tmp);
		}
		//결과값 출력
		int sum = 0;
		System.out.print("합계 : ");
		for(i = 0; i < num.length; i++) {
			sum+=num[i];
			if(i < num.length-1) {
				System.out.print(num[i] + " + ");
			}
		}
		System.out.println(num[i-1] + " = " + sum);

	}

}
