package strings;

public class Quiz2 {

	public static void main(String[] args) {
		
		String data = "It is a fun java programming";
		int aCount = 0, gCount = 0, spaceCount = 0;
		
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) == 'a') {
				aCount++;
			}else if(data.charAt(i) == 'g') {
				gCount++;
			}else if(data.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		
		System.out.println("a의 개수 : " + aCount);
		System.out.println("g의 개수 : " + gCount);
		System.out.println("알파벳의 개수 : " + (data.length() - spaceCount));
		System.out.println("문자열 길이 : " + data.length());
		
	}

}




