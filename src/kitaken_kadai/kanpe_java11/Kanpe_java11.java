package kitaken_kadai.kanpe_java11;

public class Kanpe_java11 {

	public static void main(String[] args) {

		System.out.println(getMax(1,2,3));  //=> 3
		System.out.println(getMax(3,1,2));  //=> 3
		System.out.println(getMax(2,3,1));  //=> 3
		System.out.println(getMax(3,3,3));  //=> 3

	}

	public static int getMax(int a, int b, int c) {
		
		if (a > b) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}

	}

}
