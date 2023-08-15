package text.kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("自分のじゃんけんの手を入力してください");
			System.out.println("グーはrockのr");
			System.out.println("パーpaperのp");
			System.out.println("チョキはscissorのs");

			String myChoice = scanner.next();
			
			if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close();
				return myChoice;
			}
			else {
				System.out.println("正しい手を入力してください");
			}
			
		}
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] choices = {"r", "s", "p"};	
		//乱数 0-2まで
		int randNum = (int)(Math.floor((Math.random()*3)));
		//System.out.println(randNum);
		return choices[randNum];
	}
	
	//じゃんけんを行う
	public void playGame(String myKey,String yourKey) {
		//ハッシュマップ
		HashMap<String, String> jyankenHashMap = new HashMap<String,String>();
		jyankenHashMap.put("r","グー");
		jyankenHashMap.put("s","チョキ");
		jyankenHashMap.put("p","パー");
	
		
		System.out.println("自分の手は"+jyankenHashMap.get(myKey)+",対戦相手の手は"+jyankenHashMap.get(yourKey));
		
		//グーの時
		if(myKey.equals("r")) {
			if(yourKey.equals("r")) {
				System.out.println("あいこです");
			}
			else if(yourKey.equals("s")) {
				System.out.println("自分の勝ちです");
			}
			else {
				System.out.println("自分の負けです");
			}
		}
		//チョキの時
		else if(myKey.equals("s")) {
			if(yourKey.equals("r")) {
				System.out.println("自分の負けです");
			}
			else if(yourKey.equals("s")) {
				System.out.println("あいこです");
			}
			else {
				System.out.println("自分の勝ちです");
			}
		}
		//パーの時
		else{
			if(yourKey.equals("r")) {
				System.out.println("自分の勝ちです");
			}
			else if(yourKey.equals("s")){
				System.out.println("自分の負けです");
			}
			else {
				System.out.println("あいこです");
			}
		}
		
	}

}
