import java.util.regex.*;

public class RegexExmaple{
	public static void main(String[] args) throws Exception{
		
		String text = ("Technocrats Institute of Technology Bhopal.");
		String regex = "Technocrats";
		System.out.println(Pattern.matches("Technocrats", "Technocrats"));
		System.out.println(Pattern.matches("Technocrats.*", "Technocrats Institute"));
		System.out.println(Pattern.matches("Technocrats[0-9]+", "Technocrats123"));
		System.out.println(Pattern.matches("Technocrats[0-9]", "Technocrats123aaa"));
		System.out.println(Pattern.matches("Techno[0-9]+crats", "Techno123crats"));
		
		
	}
}