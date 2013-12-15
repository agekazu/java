package kitaken_kadai.kanpe_java23;
import java.util.HashMap;

public class Kanpe_java23 {
	public static void main(String[] args) {
		// Hashの生成
		HashMap<String, String> characters = new HashMap<>();
		// put 要素の追加。addじゃない！
		characters.put("宮内れんげ", "CV:小岩井ことり");
		characters.put("一条螢", "CV:村川梨衣");
		characters.put("越谷夏海", "CV:佐倉綾音");
		characters.put("越谷小毬", "CV:阿澄佳奈");

		System.out.println(characters); //=> {越谷小毬=阿澄佳奈, 宮内れんげ=小岩井ことり, 一条螢=村川梨衣, 越谷夏海=佐倉綾音}
		System.out.println(searchValue("宮内れんげ", characters)); //=>CV:小岩井ことり
		System.out.println(searchValue("土井たか子", characters)); //=>Key: 土井たか子は存在しません
		System.out.println(deleteValue("宮内れんげ", characters)); //=>Key: 宮内れんげを削除しました
		System.out.println(characters); //=> {越谷小毬=CV:阿澄佳奈, 一条螢=CV:村川梨衣, 越谷夏海=CV:佐倉綾音}
		System.out.println(deleteValue("宮内れんげ", characters)); //=>Key: 宮内れんげは存在しません
	}

	public static String searchValue(String key, HashMap<String, String> h){
		// containsKey key検索
		if (h.containsKey(key)){
			// get key:"宮内れんげ"のvalueを取得
			return h.get(key);
		}
		return "Key: " + key + "は存在しません";
	}

	public static String deleteValue(String key, HashMap<String, String> h){
		// containsKey key検索
		if (h.containsKey(key)){
			// get key:"宮内れんげ"のvalueを取得
			h.remove(key);
			return "Key: " + key + "を削除しました";
		}
		return "Key: " + key + "は存在しません";
	}
}