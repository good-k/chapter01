package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력:");  //prompt
		int number = scanner.nextInt();
		
		// 반복문
		int sum = 0;
		int i = 1;
		while(i <= number) {
			sum = sum + i;
			i = i + 1;
		}
		
		// 결과 예 number <- 10
		// 1에서 10까지 합은 55 입니다.
		System.out.println(
			"1에서 " + number + 
			"까지의 합은" + 
			sum + "입니다.");
	}

}
