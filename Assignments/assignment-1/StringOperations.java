public class StringOperations {

    public static void main(String[] args) {

        String s = "  Java Programming  ";

        System.out.println("Length: " + s.length());
        System.out.println("Is Empty: " + s.isEmpty());
        System.out.println("CharAt 2: " + s.charAt(2));
        System.out.println("Equals: " + s.equals("Java"));
        System.out.println("CompareTo: " + s.compareTo("Java"));
        System.out.println("Contains: " + s.contains("Java"));
        System.out.println("IndexOf: " + s.indexOf("a"));
        System.out.println("LastIndexOf: " + s.lastIndexOf("a"));
        System.out.println("StartsWith: " + s.startsWith(" "));
        System.out.println("EndsWith: " + s.endsWith(" "));
        System.out.println("Matches: " + s.matches(".*Java.*"));
        System.out.println("Substring: " + s.substring(2, 6));
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Trim: " + s.trim());
        System.out.println("Replace: " + s.replace("Java", "Core Java"));

        String[] arr = s.trim().split(" ");
        System.out.println("Split:");
        for (String x : arr)
            System.out.println(x);

        System.out.println("Join: " + String.join("-", arr));
        System.out.println("ValueOf: " + String.valueOf(100));
    }
}
/**Difference (Short Exam Answer)

String → Immutable (cannot change)

StringBuffer → Mutable, thread-safe (slow)

StringBuilder → Mutable, not thread-safe (fast)*/