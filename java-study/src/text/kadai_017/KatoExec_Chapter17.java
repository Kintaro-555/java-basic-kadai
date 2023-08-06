package text.kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		//子クラスのインスタンスを生成
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		//名前をセット
		taro.setGiveName();
		ichiro.setGiveName();
		hanako.setGiveName();
		
		//自己紹介
		taro.execintroduce();
		taro.commonintroduce();
		taro.eachintroduce();
		System.out.println();
		
		ichiro.execintroduce();
		ichiro.commonintroduce();
		ichiro.eachintroduce();
		System.out.println();
		
		hanako.execintroduce();
		hanako.commonintroduce();
		hanako.eachintroduce();
	}

}
