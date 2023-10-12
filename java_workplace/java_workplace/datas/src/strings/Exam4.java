package strings;

public class Exam4 {

	public static void main(String[] args) {
		String str = new String("Have a nice day");
		
		String result = str.trim(); //공백제거
		System.out.println("-- "+str+" --");
		System.out.println("--"+result+"--");
		
		String[]spiltdata = result.split(" ");
		for(int i=0;i<spiltdata.length; i++)
		System.out.println(spiltdata[i]);//인덱스 저장용
		
		/*
		 * 항상 for문
		 * for(변수:데이터들){
		 * 	.
		 * 	.
		 * 	.
		 * }
		 * 
		 */
		System.out.println("항상 for문 결과");
		for(String data : spiltdata) {
			System.out.println(data);//데이터 출력용
		}
		

		String replace = result.replace(" ","&& *");
		System.out.println("result : "+result);
		System.out.println("replace : "+replace);
	}

}
