package projects;

public class Factorial {
	
	public static void main (String[]args) {
		System.out.println(factorial(4));
	}
    public static int factorial (int n) {
    	if ((n == 0) || (n == 1)) return 1;  //check if user inputs 0 or 1, drop out of recursion if correct
    	
    	else if (n > 1)                     // if user inputs number greater than 1, multiply them each time till recursion is over 
    		return ( (n) * factorial(n-1));
		return n;
    }
}
