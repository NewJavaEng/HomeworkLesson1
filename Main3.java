//Lesson 1 Homework Task 4
import java.util.Scanner;
public class Main3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter the 2nd number: ");
		int secondNumber = sc.nextInt();
		
		System.out.print("Enter the mathematical symbol: ");
		char sign = sc.next().charAt(0);
		sc.close();
		
		if(sign=='+'){
			int result = firstNumber + secondNumber;
			System.out.println("Result: " + result);
		}
		
		if(sign=='-'){
			int result = firstNumber - secondNumber;
			System.out.println("Result: " + result);
		}
		
		if(sign=='/'){
			int result = firstNumber / secondNumber;
			System.out.println("Result: " + result);
		}
		
		if(sign=='*'){
			int result = firstNumber * secondNumber;
			System.out.println("Result: " + result);
		}

	}

}
