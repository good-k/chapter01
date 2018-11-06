package chapter01;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("승수:");  //prompt
		int power = scanner.nextInt();
		
		int result = 1;
		
		//반복문
		int i = 0;
		while(i < power) {
			result = result * 2;
			i = i + 1;
		}		
		
		System.out.println("2의 " + power + "승은 " + result + "입니다.");
	}

}
