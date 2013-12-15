package kitaken_kadai.kanpe_java22;
import java.util.ArrayList;

public class Kanpe_java22 {

	public static void main(String[] args) {

		ArrayList<Integer> intArray = new ArrayList<>();
		// add
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);

		showArrayList(intArray);

		// indexOf 2を探して添字を返す
		int searchNumber = 2;
		System.out.println(searchNumber+"が格納された要素の添字→"+intArray.indexOf(searchNumber));   

		// set 0番目を5に変更
		intArray.set(0, 5);
		showArrayList(intArray);

		// remove 0番目を削除
		intArray.remove(0);
		showArrayList(intArray);
		
		// clear 全ての要素を削除
		intArray.clear();
		showArrayList(intArray);
		
		/*
	 	  intArray=>[1, 2, 3]
	 	  2が格納された要素の添字→1
	 	  intArray=>[5, 2, 3]
	 	  intArray=>[2, 3]
	 	  intArray=>[]
		 */
	}

	public static void showArrayList(ArrayList<Integer> a){
		System.out.println("intArray=>"+a);
	}

}
