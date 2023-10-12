package strings;

public class Quiz {

	public static void main(String[] args) {
		String str = new String("Have a nice day");
		int arr[]= new int[str.length()];
		int arrs=0;
		
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i)=='a') {
			arr[arrs++]=i;
			}
		}
		for(int i = 0; i<arrs;i++) {
			System.out.println(arr[i]);
		}
	}

}
