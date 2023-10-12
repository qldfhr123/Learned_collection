package arrays;

public class Exam5 {

	public static void main(String[] args) {
		int arr[] = new int[] {4,8,2,7,6};
		int i,j,tmp;
		for(i=0; i<arr.length-1;i++) {
			for(j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) { //오름차순일때 내림일때는 기준이 작다고 작성
					tmp =arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		}
		System.out.print("정렬후 : ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
