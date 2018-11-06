package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		//정수
		byte  b = 60;
		short s = 300;
		int   i = 456666;
		long  l = 123456789321L;
		
		//실수
		float f = 3.14f;
		double d = 3.14;
		
		//문자
		char c = 'A';
		char c2 = 65;
		
		//부울(boolean)
		boolean bool = true;
		
		//문자열
		//String str = "Hello";
		String str = new String("Hello");
		char c3 = str.charAt(2);
		
		//상수(변경 못하는 값을 저장하고 있는 변수)
		final int NUMBER = 10;
		//에러
		//number = 100;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(bool);
	}

}
