package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//implicity(암시적) type casting
		int i = 10;
		long l = i;
		
		//explicity(명시적) tpe casting
		long l2 = 9123456789L;
		int i2 = (int)l2; 

		System.out.println( i + ":" + l);
		System.out.println( i2 + ":" + l2);
	}

}
