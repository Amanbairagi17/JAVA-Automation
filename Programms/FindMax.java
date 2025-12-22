import java.util.*;

public class FindMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n for array size : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter values of array : ");
		for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
		
		int max = -1;
		for(int i : arr) max = Math.max(i,max);
		
		System.out.print(max);
	}
}