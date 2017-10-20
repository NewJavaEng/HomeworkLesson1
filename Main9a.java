//Lesson 1 Homework Task 11
import java.util.Scanner;

public class Main9a {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter symbol: ");
			char mySymb = sc.next().charAt(0);
			if (mySymb == 'q') {
				break;
				
			}
			
		}
		
		sc.close();
		
	}
	
}
