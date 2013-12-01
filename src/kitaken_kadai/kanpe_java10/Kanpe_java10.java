package kitaken_kadai.kanpe_java10;

public class Kanpe_java10 {

	public static void main(String[] args) {

		System.out.println(getMin(1,2));
		System.out.println(getMin(2,1));
		System.out.println(getMin(1,1));
		/* 出力
		 * 1 
		 * 1 
		 * 1 
		 */
	}

	private static int getMin(int a, int b){
		return a <= b ? a : b;
	}

}
