package kadai_024;

import java.util.Scanner;
public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//初期メッセージ
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsの入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//じゃんけん実行用のオブジェクトを生成
		Jyanken_Chapter24 janken = new Jyanken_Chapter24();
		
		//入力値の取得用にオブジェクトを生成
		Scanner scanner = new Scanner(System.in);
		//入力値の取得
		String myHand	= "";
		String input 	= "";

		//自分のじゃんけんの手を判定
		//正しい手になるまで繰り返す
		while (myHand.equals("")) {
			input = scanner.next();
			myHand = janken.getMyChoice(input);
		}
		//相手のじゃんけんの手を判定
		String yourHand = janken.getRandom();
		//自分の相手の手を比較して結果を出す
		janken.playGame(myHand, yourHand);
		//入力のクローズ
		scanner.close();

	}

}
