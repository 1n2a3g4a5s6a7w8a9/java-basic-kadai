package kadai_020;

import java.util.HashMap;
//辞書クラス
public class Dictionary_Chapter20 {
	HashMap<String, String> dctmap = new HashMap<String, String>();
	public Dictionary_Chapter20() {

		//英単語と意味を追加(keyと紐づけるのでhashmap
		dctmap.put("apple", "リンゴ");
		dctmap.put("peach", "桃");
		dctmap.put("banana", "バナナ");
		dctmap.put("lemon", "レモン");
		dctmap.put("pear", "梨");
		dctmap.put("kiwi", "キウィ");
		dctmap.put("strawberry", "いちご");
		dctmap.put("grape", "ぶどう");
		dctmap.put("muscat", "マスカット");
		dctmap.put("cherry", "さくらんぼ");

	}
	public void dictionary_check(String fruit_eng) {
		String fruit_jpn = "";
		//辞書を調べる（登録された数まで繰り返し
		//戻り値は、値
//		for(int i = 0; i < dctmap.size(); i++) {
//			System.out.println(dctmap.get(fruit_eng));
			//
			if(dctmap.get(fruit_eng) == null ) {
				System.out.println(fruit_eng+"は辞書に存在しません" );
			}
			else {
				fruit_jpn = dctmap.get(fruit_eng);
				System.out.println(fruit_eng+"の意味は"+ fruit_jpn );
				
			}
//		}
	}

}
