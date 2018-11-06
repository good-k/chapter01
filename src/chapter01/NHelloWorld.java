package chapter01;

import java.util.Scanner;

public class NHelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("회수 입력:");  //prompt
		int count = scanner.nextInt();
		
		int i = 0;
		while(i < count) {
			System.out.println("Hello World");
			i = i + 1;
		}		
		
		
		scanner.close();
	}

}
