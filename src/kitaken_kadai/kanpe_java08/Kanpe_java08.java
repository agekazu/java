package kitaken_kadai.kanpe_java08;

public class Kanpe_java08 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("i="+i+":FizzBuzz");
				continue;
			}
			else if (i % 5 == 0) {
				System.out.println("i="+i+":Buzz"); 
				continue;
			}
			else if (i % 3 == 0) {
				System.out.println("i="+i+":Fizz"); 
				continue;
			}

			System.out.println("i="+i);

		}

	}

}