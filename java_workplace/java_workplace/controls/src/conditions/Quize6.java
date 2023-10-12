package conditions;

import java.util.Scanner;

public class Quize6 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int data1, data2;
		int snacks = 1000, coffe = 2000;
		double discount =0.0;
		
		System.out.println("10개 이상 구매시 10% 할인! 100개 이상은 12% 할인입니다!");
		System.out.print("구매 하실 수량을 입력하세요 (1개당 1000원입니다): ");
		data1 = input1.nextInt();
		int sum = snacks * data1; //과자 금액
		
		if(data1 >= 10 && data1 <= 99) {
			 discount = 0.10;
		}
		else if(data1 >= 100) {
			discount = 0.12;
		}
		
		double total = sum - (sum * discount);
		
		System.out.println(+ (discount * 100) + "% 만큼 할인 받았습니다 \n계산된 금액은 :"+ ((int) total));
		
		
		System.out.print("커피 개수를 입력해주세요: ");
		data2 = input2.nextInt();
		int amount = coffe * data2; //커피 가격
		
		if(data2 >10) {
			amount = amount-((data2-10)*500);		
			System.out.print("10개 초과 구매해주셔서 가격이 1개의 1500원 으로 변경되었어요! \n");
		}
		else {
			System.out.print("할인 받지 못했습니다!\n");
		}
		
		System.out.println("총 가격은" +amount);

		
	}

}
