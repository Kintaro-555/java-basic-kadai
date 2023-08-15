package text.kadai_024;

public class JyankenExec_Chapter24 {
	public static void main(String[] args) {
		//インスタンス生成
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		String myChoice = jyanken.getMyChoice();
		String yourChoice = jyanken.getRandom();
		jyanken.playGame(myChoice, yourChoice);
	}

}
