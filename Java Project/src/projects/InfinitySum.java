package projects;

public class InfinitySum {

	public static void main(String[] args) { 		

		System.out.println(addNumbers(5));
	}
	public static int addNumbers (int x) {
		int sum = 0;  // define and initialize sum to zero
		
		//create a for loop to increment numbers till it gets to max number set 
		for (int i = 0; i <= x; i++)
			sum += i;  // add each number as it gets incremented and store it in memory location sum
		return sum;
	}
}
