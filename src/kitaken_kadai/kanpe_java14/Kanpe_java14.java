package kitaken_kadai.kanpe_java14;

public class Kanpe_java14 {

	public static void main(String[] args) {
		System.out.println("素数一覧");
		System.out.println("2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,...");
		System.out.println("素数判定結果");
		for (int i=2; i<=100;i++) {
			if (isPrime(i)){
				System.out.print(i+",");//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
			}
		}
		System.out.print("...");
		
		/*
		 * 素数一覧
		 * 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,...
		 * 素数判定結果
		 * 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,... 
		 */
	}

	public static boolean isPrime(int n) {
		// 素数確認方法:フェルマーテスト
		// 2 の（N-1）乗を求め、それを N で割る。余りが 1 でないならば、N は素数ではない。
		if (n == 2) {
			return true;
		} else {
			return Math.pow(2, n-1) % n == 1 ? true : false;
		}
	}
}
