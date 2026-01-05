import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args){
		String str = "Aman";
		
		StringBuilder s = new StringBuilder();
		
		for(int i=str.length()-1 ; i>=0 ; i--){
			s.append(str.charAt(i));
		}


		System.out.println("Reverse string is : " +s.toString());
		
	
	}
}