import java.lang.String;

public class StringOperation{
	public static void main(String[] args){
		String str = "Aman";
		String str1 = "aman";
		
		StringBuilder sb = new StringBuilder("Aman Bahu");
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(2));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.startsWith("A"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.substring(1));
		System.out.println(str.concat(" Bairagi"));
		
		System.out.println(sb.capacity());
		
		
		
		
		
	}
}