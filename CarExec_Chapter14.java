package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		//ギアと速度のデータを作成
		//左のクラスと右のクラス名は同じになる
		Car_Chapter14 gearNow = new Car_Chapter14(1,10); //1速で10㎞
		//Car_Chapter14 gear3 = new Car_Chapter14(3,30); //3速で30㎞
	
	//ギアチェンジを行う。
		gearNow.gearChange(3);
	//現在のギア速度で走り出す
		gearNow.run();
		
	}
}
