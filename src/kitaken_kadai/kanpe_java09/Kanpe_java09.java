package kitaken_kadai.kanpe_java09;

public class Kanpe_java09 {

	public static void main(String[] args) {
		System.out.println(getMax(6,11));
		System.out.println(getMax(13,11));
		System.out.println(getMax(1,1));
		/* 出力
		 * 11 
		 * 13 
		 * 1 
		 */
	}

	private static int getMax(int a, int b){
		return (a >= b) ? a : b;
	}
}
