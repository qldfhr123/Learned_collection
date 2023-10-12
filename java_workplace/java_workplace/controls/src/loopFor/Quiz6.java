package loopFor;

public class Quiz6 {

	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int x,z;
		for(x=1; x<=21; x+=5) {
			for(z=0; z<5; z++) {
				System.out.print((z+x) +"\t");
			}
			System.out.println();

		}
	}
}
