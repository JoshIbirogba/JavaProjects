package basics;

public class Weather {
	public static void main (String[]args) {
		//This program will give suggestions of what to wear based on the weather (temperature and sun conditions)
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println(" It's a pleasant weather. Wear shorts and t-shirts");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println(" It's a little cooler. Perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your face");
	}
		
		else if ((temperature > 50) || sunCondition == "Overcast") {
			System.out.println("Looks like a cold day, bring a sweater");
		}
		
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
	}
	

}
