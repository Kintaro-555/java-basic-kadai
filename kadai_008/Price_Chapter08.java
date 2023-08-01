package text.section_05;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge=30;
		int serviceCost=3000;
		
		switch(userAge){
			case 10 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 20 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 30 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 40 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 50 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 60 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 70 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
			case 80 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		default -> System.out.println("500円");
		}
	}
}
