//Lesson 1 Homework Task 12
import java.util.Scanner;

public class Main9b {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter symbol: ");
			String mySymb = sc.nextLine();
			if (mySymb.equals("stop")) {
				break;
				
			}
			
		}
		
		sc.close();
		
	}
	
}

