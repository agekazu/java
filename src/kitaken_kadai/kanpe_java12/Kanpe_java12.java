package kitaken_kadai.kanpe_java12;

public class Kanpe_java12 {

	public static void main(String[] args) {
		System.out.println(getMin(1,2,3));  //=> 3
		System.out.println(getMin(3,1,2));  //=> 3
		System.out.println(getMin(2,3,1));  //=> 3
		System.out.println(getMin(-1,-1,-2));  //=> -2
		System.out.println(getMin(1,1,1));  //=> 1

	}

	public static int getMin(int a, int b, int c) {
		int d = a <= b? a : b;
		return d <= c? d : c;
	}

}
