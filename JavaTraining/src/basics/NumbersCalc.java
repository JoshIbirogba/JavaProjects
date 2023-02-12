package basics;

public class NumbersCalc {
	public static void main (String[]args) {
		System.out.println("Program is starting..............");
		int numA = 10;
		int numB = 20;
		
		printName();
		addNumbers(numA, numB);
		multiplyNumbers(numA, numB);
		
	}
	
	static void printName() {
		System.out.println("My name is Joshua Ibirogba");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//This function will add two numbers 
		int sum = numberA + numberB;
		System.out.println("The sum of numbers is " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product, product);
		System.out.println("The sum of product of numbers " + valueA + " and " + valueB + " is " + product);
		return product;
		
	}
  
}
