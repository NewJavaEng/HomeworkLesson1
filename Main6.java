//Lesson 1 Homework Task 7
import java.util.Scanner;

public class Main6 {
		
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number from -9 to 9 and system will recognize it only if it even and positive: ");
			int number = sc.nextInt();
			sc.close();
			
			if((number%2)==0&number>0){
				System.out.println("Number " + number + " is even and positive ");
				
			}
			
	}
	
}

