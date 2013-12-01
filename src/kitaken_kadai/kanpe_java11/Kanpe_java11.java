package kitaken_kadai.kanpe_java11;

public class Kanpe_java11 {

	public static void main(String[] args) {

		System.out.println(getMax(1,2,3));  //=> 3
		System.out.println(getMax(3,1,2));  //=> 3
		System.out.println(getMax(2,3,1));  //=> 3
		System.out.println(getMax(3,3,3));  //=> 3

	}

	public static int getMax(int a, int b, int c) {
		int d = a >= b ? a:b;
		return d >= c ? d:c;
	}
}
