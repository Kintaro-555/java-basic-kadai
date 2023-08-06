package text.kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void checkDictinaly(String searchWords[]) {
		//英単語の辞書として機能する
		HashMap<String, String> dictionalyMap = new HashMap<String, String>();
		
		//辞書の追加
		dictionalyMap.put("apple", "りんご");
		dictionalyMap.put("peach", "桃");
		dictionalyMap.put("banana", "バナナ");
		dictionalyMap.put("lemon", "レモン");
		dictionalyMap.put("pear", "梨");
		dictionalyMap.put("kiwi", "キウィ");
		dictionalyMap.put("strawberry", "いちご");
		dictionalyMap.put("grape", "ぶどう");
		dictionalyMap.put("muscat", "マスカット");
		dictionalyMap.put("cherry", "さくらんぼ");
		
		//String[] searchWords = {"apple", "banana", "grape", "orange"};
		
		for(String word : searchWords) {
			if(dictionalyMap.get(word) == null) {
				System.out.println(word+"は辞書に存在していない");
			}
			else {
				System.out.println(word+"の意味は"+dictionalyMap.get(word));
			}
		}
	}
}
/*appleの意味はりんご
bananaの意味はバナナ
grapeの意味はぶどう
orangeは辞書に存在しません
*/