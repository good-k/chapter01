package chapter01;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] arraysInt2 = new int[5];// 배열은 객체다. 객체 생성은 new 키워드로 해야 한다.
		arraysInt2[0] = 1;
		arraysInt2[1] = 2;
		arraysInt2[2] = 3;
		arraysInt2[3] = 4;
		arraysInt2[4] = 5;
		
		for(int i = 0; i < arraysInt2.length; i++) {
			System.out.println( arraysInt2[i] );
		}
	}

}
