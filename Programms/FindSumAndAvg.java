import java.util.*;

public class FindSumAndAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][2];
		int sum = 0;
		int avg = 0;
		
		System.out.print("Enter values of array : ");
		for(int i=0 ; i<2 ; i++){
			for(int j=0 ; j<2 ; j++){
				sum += arr[i][j] = sc.nextInt();
			}
		}
		avg = sum / 4;
		
		
		System.out.print("Sum : " + sum + " and Average : " + avg );
	}
}