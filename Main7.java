//Lesson 1 Homework Task 8
import java.util.Scanner;

public class Main7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full month title starting with the capital letter: ");
		String monthName = sc.nextLine();
		String seasonName = "";
		sc.close();
		
		switch (monthName) {
		
		case "December":
		case "January":
		case "February": 
			seasonName = "This is winter";
			break;
			
		case "March":
		case "April":
		case "May": 
			seasonName = "This is spring";
			break;
			
		case "June":
		case "July":
		case "August": 
			seasonName = "This is summer";
			break;
			
		case "September":
		case "October":
		case "November":
			seasonName = "This is autumn";
			break;
			
		}
		
		System.out.println(seasonName);
		
	}
	
}
	
	
