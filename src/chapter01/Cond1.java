package chapter01;

public class Cond1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 0;
		
		if( a > b ) {
			c = a - b;
		} else { // a <= b
			c = b - a;
		}
		if( a > b ) {
			c = a - b;
		} else { // a <= b
			c = b - a;
		}		
//		if( a > b )
//			c = a - b;
//		else
//			c = b - a;
		
		System.out.println(a);
		System.out.println(c);
	}

}
