package chapter01;

public class TypeCast2 {

	public static void main(String[] args) {
		byte b;
		
		int i = 414;
		float f = (float)123.456;
		
		i = (int)f;
		System.out.println(i + ":" + f);
	}

}
