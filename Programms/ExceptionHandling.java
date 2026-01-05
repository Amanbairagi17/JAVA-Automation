import java.util.*;

public class ExceptionHandling{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,5,6,0};
		
		for(int i=0 ; i<arr.length ; i++){
			try{
				System.out.println(arr[i]/arr[10]);
				System.out.println(arr[i]/arr[2]);
			}catch(ArithmeticException e){
				System.out.println("Division error  : ");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Out of bound  : ");
			}
			finally{
				System.out.println("Program excute : ");
			}
			
		}
	}
}