import java.util.Scanner;

public class LargestWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		
		String[] words = str.split(" ");
		int maxWords = -1;
		int maxIdx = -1;
		
		for(int i=0 ; i<words.length ; i++){
			String word = words[i];
			if(word.length() >  maxWords){
				maxWords = word.length();
				if(maxIdx < i) maxIdx = i;
			}
				
			
			
		}



		System.out.println("Maximun word in sentence is " +words[maxIdx]+ " and it have " +maxWords+ " words ");
		
	
	}
}