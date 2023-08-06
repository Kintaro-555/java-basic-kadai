package text.kadai_017;

abstract public class Kato_Chapter17 {
	//フィールド
	public String familyNameString = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	//クラスメソッド
	//共通の紹介を出力する
	public void commonintroduce() {
		System.out.println("住所は"+this.address+"です");
	}
	//個別の紹介を出力する（抽象メソッド）
	abstract public void eachintroduce();
	
	//紹介を実行する
	public void execintroduce() {
		//名前の紹介
		System.out.println("名前は" + this.familyNameString + this.givenName + "です");
	}
}
