package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 30;
		
		// Q1: n1 값이 항상 큰 값이 되도록 만드는 문제
		//     만약 n1값이 작으면 두 값을 교체하는 문제
		if(n1 < n2) {
			// swap
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
	}

}
