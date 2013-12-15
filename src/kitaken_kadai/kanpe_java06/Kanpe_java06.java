package kitaken_kadai.kanpe_java06;

public class Kanpe_java06 {

	public static void main(String[] args) {

		for (int left=1; left<=9; left++) {
			System.out.println(left+"の段");
			for (int right=1; right<=9; right++) {
				System.out.println(left+"*"+right+"="+left*right);
			}
		}
	}
}