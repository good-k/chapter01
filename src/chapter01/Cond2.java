package chapter01;

public class Cond2 {

	public static void main(String[] args) {
		int a1 = 250;
		int a2 = 100;
		int a3 = 500;
		
		//Q2: 최대값을 판별하는 조건을 완성해 보세요.
		//Output: 최대값은 50 입니다.
		//Sol:
		if( a1 > a2 ) {
			// a1이 a2보다 큰 경우
			// -> ? a1 <> a3
			if( a1 > a3 ) {
				System.out.println( "최대값은 " + a1 + "입니다.");
			} else {
				System.out.println( "최대값은 " + a3 + "입니다.");
			}
		} else {
			// a2가 a1보다 큰 경우
			// -> ? a2 <> a3
			if( a2 > a3 ) {
				System.out.println( "최대값은 " + a2 + "입니다.");
			} else {
				System.out.println( "최대값은 " + a3 + "입니다.");
			}
		}
		
	}

}
