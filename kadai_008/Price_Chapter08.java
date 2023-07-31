package text.section_05;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge=30;
		int serviceCost=3000;
		
		switch(userAge){
			case 30 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		default -> System.out.println("500円");
		}
	}
}
