package methodExam;

public class Prime {
	private int data;

	public void setData(int data){
		this.data = data;
		
	}
	public int getData() {
		return data;
	}
	public boolean isPrime() { 
		boolean result = true;//
		for (int i = 2; i < data; i++) {
			if (data % i == 0) {
				result = false;
				break;
			} 
			else {
				result = true;
				break;
			}
		}
		return result;
	}
}
	

