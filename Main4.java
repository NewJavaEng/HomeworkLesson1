//Lesson 1 Homework Task 5
import java.util.Scanner;
public class Main4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number from 0 to 9: ");
		int number = sc.nextInt();
		sc.close();
		
        String numberName;
        switch (number) {
        	case 0:  numberName = "zero";
        			 break;
            case 1:  numberName = "one";
                     break;
            case 2:  numberName = "two";
                     break;
            case 3:  numberName = "three";
                     break;
            case 4:  numberName = "four";
                     break;
            case 5:  numberName = "five";
                     break;
            case 6:  numberName = "six";
                     break;
            case 7:  numberName = "seven";
                     break;
            case 8:  numberName = "eight";
                     break;
            case 9:  numberName = "nine";
                     break;
            default: numberName = "Invalid month";
                     break;
        }
        System.out.println(numberName);
    }

}
