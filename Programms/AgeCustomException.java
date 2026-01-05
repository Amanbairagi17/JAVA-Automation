import java.util.*;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
public class AgeCustomException{
	static void checkAge(int age) throws InvalidAgeException{
		if(age < 18) throw new InvalidAgeException("Inavalid Age");
		else {
			System.out.print("You are eligible to vote ");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0 ; i<arr.length ; i++){
				arr[i] = sc.nextInt();
				try{
					checkAge(arr[i]);
				}
				catch(InvalidAgeException e){
					System.out.print("Exception Handled " +e.getMessage());
				}
			
			
		}
	}
}