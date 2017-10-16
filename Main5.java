//Lesson 1 Homework Task 6
import java.util.Scanner;
public class Main5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number from 0 to 9 and the system will recognize it only if it is even: ");
		int number = sc.nextInt();
		sc.close();
		
		if((number%2)==0){
            System.out.println("Number " + number + " is even ");
        }
		
	}

}
