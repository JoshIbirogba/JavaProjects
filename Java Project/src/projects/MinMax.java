package projects;
import java.util.Random;

public class MinMax {
	
	public static void main (String []args) {
		int[]numbers = new int [11];
		int i;
		
		
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = ((int) (Math.random() * 50 + 1));
			System.out.println(numbers[i]);
		}
		int max = maxNumber(numbers);
		int min = minNumber(numbers);
		double averageTotal = average(numbers);
		
		System.out.println("The maximum number in an array is " + max);
		System.out.println("The minimum number in the array is " + min);
		System.out.println("The average number in the array is " + averageTotal);
	}
	public static int maxNumber(int []maxArray) {
		int max = Integer.MIN_VALUE;
		for ( int i = 0; i < maxArray.length; i++) {
			if (maxArray[i] > max) {
				max = maxArray[i];
			}
		}
		
		return max;
	}
	public static int minNumber(int [] minArray) {
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < minArray.length; i++) {
			if ( minArray[i] < temp) {
				temp = minArray[i];
			}
		}
		return temp;
	}
   public static double average(int []avg) {
	   int total = 0;
	   double average = 0;
	   for (int i = 0; i < avg.length; i++) {
		   total += avg[i];
		   average = total / avg.length;
	   }
	   return average;
   }

}
