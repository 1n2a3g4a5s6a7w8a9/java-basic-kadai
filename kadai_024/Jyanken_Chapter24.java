package kadai_024;

import java.util.HashMap;

public class Jyanken_Chapter24 {
	//自分のじゃんけんの手を判定
	public String getMyChoice(String input) {
		String myHand = "";
				
		if ((input.equals("s")) || ( input.equals("p")) ||(input.equals("r"))) {
			myHand = input;
		}
		else {
			System.out.println("入力内容が間違っています。入力し直してください");
		}
		//私のじゃんけんの手
		return myHand;
	}
	//相手のじゃんけんの手を選ぶ
	public String getRandom() {
		String yourHand = "";
		//整数に置換　乱数を取得し、3未満の数をfloorで切り捨て
		int random = (int)Math.floor(Math.random() * 3);
		//じゃんけんの結果を判定
		yourHand = switch (random) {
			case 0 -> "r";
			case 1 -> "s";
			case 2 -> "p";
			default -> "";
		};
		return yourHand;
		
	}
	//じゃんけんを行う
	public void playGame(String myHand, String yourHand) {
		HashMap<String, String> handName = new HashMap<String,String>();
		handName.put("r", "グー");
		handName.put("s", "チョキ");
		handName.put("p", "パー");
		
		System.out.println("自分の手は"+ handName.get(myHand) + "," + "対戦相手の手は"+ handName.get(yourHand));
	//判定
		if (myHand.equals(yourHand)) {
			System.out.println("あいこです");
		}
		else {
			if ((myHand.equals("r")) && (yourHand.equals("s"))) {
				System.out.println("自分の勝ちです");
			}
			if ((myHand.equals("r")) && (yourHand.equals("p"))) {
				System.out.println("自分の負けです");
			}
			if ((myHand.equals("s")) && (yourHand.equals("r"))) {
				System.out.println("自分の負けです");
			}
			if ((myHand.equals("s")) && (yourHand.equals("p"))) {
				System.out.println("自分の勝ちです");
			}
			if ((myHand.equals("p")) && (yourHand.equals("s"))) {
				System.out.println("自分の負けです");
			}
			if ((myHand.equals("p")) && (yourHand.equals("r"))) {
				System.out.println("自分の勝ちです");
			}
		}		
	}
}
