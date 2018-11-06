package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력:");  //prompt
		int number = scanner.nextInt();
		
		boolean isPrime = true;
		
		
		
		
		//출력:
		if( isPrime == true ) {
			System.out.println(number + "은 소수입니다.");
		} else {
			System.out.println(number + "은 소수가 아닙니다.");
		}
		
		
		
	}

}
