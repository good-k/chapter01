package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		//사칙 연산
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		a = a + 1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		System.out.println(a++);
		//System.out.println(a);
		//a = a + 1;
		System.out.println(a);
	}

}
