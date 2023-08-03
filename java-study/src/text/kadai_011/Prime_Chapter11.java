package text.kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] isPrimeNumberArray  = new boolean[101];
		
		//素数判定フラグ配列の初期化
        for (int i = 0; i < isPrimeNumberArray.length; i++) {
            isPrimeNumberArray[i] = true;
        }
		
		//素数判定
		for(int i=2; i<101; i++) {
			for(int j=2; j < i; j++) {
				if(i % j == 0) {
					isPrimeNumberArray[i] = false;	
					break;
				}
			}
			
		}
		//結果を表示
		for(int i=2; i<101; i++) {
			if(isPrimeNumberArray[i] == true) {
				System.out.println(i);	
			}
		}
	}

}
