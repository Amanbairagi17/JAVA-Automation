import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
//pattern = Define a pattern to be used in a search 
//Matcher 

public class PatternMatcher{
	public static void main(String[] args) throws Exception{
		
		Pattern pattern = Pattern.compile("Technology",Pattern.CASE_INSENSITIVE);
		//Pattern patter = Pattern.compile("Technology");
		Matcher matcher =  pattern.matcher("Technocrats Institute of Technology");
		boolean matchFound = matcher.find();
		if(matchFound) System.out.println("Match found");
		else System.out.println("Match found");
		
		
	}
}