package kadai_020;
//辞書クラスを実行するクラス
public class DictionaryExec_Chapter20 extends Dictionary_Chapter20{

	public static void main(String[] args) {
		//インスタンスの作成
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		String[] fruit_array = new String[4];
		fruit_array[0] = "apple";
		fruit_array[1] = "banana";
		fruit_array[2] = "grape";
		fruit_array[3] = "orange";
		
		for (int i = 0; i < fruit_array.length; i++ ) {
			dictionary.dictionary_check(fruit_array[i]);
		}
	}

}
