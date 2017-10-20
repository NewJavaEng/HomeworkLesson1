//Lesson 1 Homework Task 10
public class Main9 {
	
	public static void main(String[] args) {
		
		int threeNumbers[] = { 50, 10, 80 };
		int max = threeNumbers[0];
		int min = threeNumbers[0];
		
		for(int i = 1; i < threeNumbers.length; i++){
			if (max < threeNumbers[i]) 
				max = threeNumbers[i];
		}
		
		System.out.println("Max = " + max);
		
		for(int i = 1; i < threeNumbers.length; i++){
			if (min > threeNumbers[i])
				min = threeNumbers[i];
		}
		
		System.out.println("Min = " + min);
		
		int summ = max + min;
		
		System.out.println("Summ of max and min = " + summ);
		
	}
	
}
