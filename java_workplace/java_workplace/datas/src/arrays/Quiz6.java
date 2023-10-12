	package arrays;
	
	import java.util.Random;
	
	public class Quiz6 {
	
		public static void main(String[] args) {
			Random lotto = new Random();
			int [] num= new int[6];
			 for(int i=0; i<6; i++) {
				 num[i] = lotto.nextInt(45)+1;
		            for(int j=0; j<i; j++) {
		                if(num[i] == num[j]) { //중복여부 판별
		                    i--;// 중복시 배열에서 제거
		                }
		            }
		        }
			 	System.out.print("당첨 번호 : ");
		        for(int i=0; i<6; i++) {
		            System.out.print(num[i]+" ");
		        }
		        System.out.println();
	
			int a,b,tmp;
			for(a=0; a<num.length-1;a++) {
				for(b=a+1; b<num.length;b++) {
					if(num[a]>num[b]) { //오름
						tmp =num[a];
						num[a]=num[b];
						num[b]=tmp;
					}
					
				}
			}
			System.out.print("번호 오름 차순 정렬 : ");
			for(a=0;a<num.length;a++) {
				System.out.print(num[a]+" ");
			}
	
		}
	
	}
