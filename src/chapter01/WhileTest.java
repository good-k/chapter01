package chapter01;

public class WhileTest {

	public static void main(String[] args) {
		
		/* 1 에서 부터 10까지 숫자를 출력 */
		
		//(초기)화
		int i = 0;
		
		//진입(조건) 검사
		while(i < 10) {
			System.out.println(i);
			//(증감)연산
			i = i + 1;
		}
		
		System.out.println("끝!");
	}
}
