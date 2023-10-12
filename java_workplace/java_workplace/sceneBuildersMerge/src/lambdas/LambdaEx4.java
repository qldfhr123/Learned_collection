package lambdas;

interface ILambdaEx4{
	void lambda(int data);
}

public class LambdaEx4 {
	public static void main(String[] args) {
		ILambdaEx4 ex4 = (tmp) -> {
			for(int i = 0; i < tmp; i++)
				System.out.println(i + 1 + " 반복");
		};
		
		ex4.lambda(5);
		
		ex4 = tmp -> {
				for(int i = 0; i < tmp; i++)
					System.out.println(i + 1 + " 반복");
		};
		
		ex4.lambda(5);
		
	}
}






