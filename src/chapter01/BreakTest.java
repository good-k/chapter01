package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		while(true) {
			sum += num;
			if(sum > 5000) {
				System.out.println(num);
				break;
			}
			num++;
		}
		
		System.out.println(sum);
		
//		for(;;) {
//		}
	}

}
