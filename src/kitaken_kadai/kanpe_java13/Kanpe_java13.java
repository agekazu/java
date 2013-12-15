package kitaken_kadai.kanpe_java13;

public class Kanpe_java13 {
	public static void main(String[] args) {

		System.out.println(getMid(1,2,3));  //=> 2
		System.out.println(getMid(3,1,2));  //=> 2
		System.out.println(getMid(2,3,1));  //=> 2
		System.out.println(getMid(-1,-1,-2));  //=> -1
		System.out.println(getMid(1,1,1));  //=> 1

	}

	public static int getMid(int a, int b, int c) {

		if (a <= b) {
			if (b <= c) { 		// a <= b <= c
				return b;
			} else if (a <= c) {	// a <= c <= b
				return c;
			} else {			// c <= a <= b
				return a;
			}
		} else {
			if (a <= c) {		// b <= a <= c
				return a; 
			} else if(c <= a) {	// b <= c <= a
				return c;
			} else {			// c <= b <= a
				return  b;
			}
		}

	}

}
