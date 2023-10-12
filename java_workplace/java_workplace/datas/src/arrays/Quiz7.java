package arrays;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("생성할 배열의 길이를 입력 : ");
		input=sc.nextInt();
		int [] num= new int[input];
		String [] name = new String[input]; 
		int [] age = new int [input] ;
		System.out.println(input+"개의 배열이 생성되었습니다.");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1+"정보 입력");
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
			
		}
		int a,b,tmp;
		String tmp2 = null;
		for(a=0; a<num.length-1;a++) {
			for(b=a+1; b<num.length;b++) {
				if(age[a]>age[b]) { //오름
					tmp =age[a]; 	tmp2=name[a];
					age[a]=age[b];	name[a]=name[b];
					age[b]=tmp;		name[b]=tmp2;
				}
				
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1+"정보");
			System.out.print("이름 :"+name[i]+", 나이 : "+age[i]+"세 \n");
		}
		
	}

}
