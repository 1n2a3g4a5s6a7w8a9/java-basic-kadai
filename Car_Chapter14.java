package kadai_014;

public class Car_Chapter14 {
	//フィールド（内部データ）の作成
	private int		gear	= 1;	//１速から５速までのギアを表す
	private int		speed	= 10;	//ギアチェンジ後の速度を表す
	private int		beforeGear = 1;	//変更前のギア
	
	//コンストラクタ（オブジェクト）の初期化
	public Car_Chapter14(int gear , int speed) {
		this.gear	= gear;
		this.speed	= speed;
	}
	//【メソッド】ギアチェンジ
	 public void gearChange(int afterGear) {
		this.gear	= afterGear;	//ギアチェンジ
		//ギアに併せて速度チェンジ
		this.speed	= switch (afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		System.out.println("ギア"+ this.beforeGear +"から" + this.gear + "に切り替えました");
	}
	 public void run() {
		 System.out.println("速度は時速" + this.speed + "kmです");
	 }
}
