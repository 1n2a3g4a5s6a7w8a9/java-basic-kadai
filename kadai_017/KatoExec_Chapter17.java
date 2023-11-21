package kadai_017;
//子クラスの実行をする
public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// 子クラスのインスタンスを作成する
		//
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();

		//たろうさん
		taro.setGivenName("太郎");
		taro.execIntroduce();
		System.out.println("");

		//いちろうさん
		ichiro.setGivenName("一郎");
		ichiro.execIntroduce();
		System.out.println("");

		//はなこさん
		hanako.setGivenName("花子");
		hanako.execIntroduce();
		System.out.println("");
		
	}

}
