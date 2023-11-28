package kadai_011;

public class Prime_chapter11 {

	public static void main(String[] args) {
		//100個の配列を準備
		int[] qtyArray = new int[100];
		int amari = 0;
		//数字を代入
		for(int i = 0; i < 100; i++ ) {
			qtyArray[i] = i + 1;
//			System.out.println(qtyArray[i-1]);
		}
		//配列を順番にチェック
		for(int i = 0; i < qtyArray.length; i++ ) {
			//配列の値が１より大きいこと
//			System.out.println("現在の数字は" + qtyArray[i]);
			if ( qtyArray[i] > 1 ) {
				//素数のチェック
				for (int j = 2; j < 100; j++) {
					amari = qtyArray[i] % j;
					
					if ( amari == 0 ) {
						if ( qtyArray[i] == j ) {
							//素数をコンソールに出力
							System.out.println("素数：" + qtyArray[i]);
						} else {
						//余りZEROでも割る数と一致していないなら素数ではないのでループを抜ける
							break;
						}
					}
					
				}
			}
		}
	}

}
