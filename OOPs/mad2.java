public class mad2 {
     public static void main(String[] args) {

        System.out.println("===== STRING BASICS =====");

        String str = "Hello Java";

        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring: " + str.substring(6));
        System.out.println("Contains Java: " + str.contains("Java"));

        System.out.println("\n===== STRING POOL =====");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println("\n===== STRING IMMUTABILITY =====");

        String name = "Hello";
        name.concat(" World");

        System.out.println("Original: " + name);

        name = name.concat(" World");

        System.out.println("Updated: " + name);

        System.out.println("\n===== LITERAL VS NEW STRING =====");

        String a = "Python";
        String b = new String("Python");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println("\n===== EQUALS VS EQUALSIGNORECASE =====");

        String x = "Java";
        String y = "java";

        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));

        System.out.println("\n===== STRING CONCATENATION =====");

        String first = "Hello";
        String second = "World";

        System.out.println(first + " " + second);
        System.out.println(first.concat(" ").concat(second));

        System.out.println("\n===== LENGTH VS LENGTH() =====");

        String language = "Java";

        System.out.println(language.length());

        int[] numbers = {10, 20, 30, 40};

        System.out.println(numbers.length);

        System.out.println("\n===== SUBSTRING METHOD =====");

        String text = "Programming";

        System.out.println(text.substring(0, 7));
        System.out.println(text.substring(3));

        System.out.println("\n===== TRIM VS STRIP =====");

        String space = "   Hello Java   ";

        System.out.println(space.trim());
        System.out.println(space.strip());

        System.out.println("\n===== REPLACE METHOD =====");

        String sentence = "I like Python";

        System.out.println(sentence.replace("Python", "Java"));

        System.out.println("\n===== SPLIT METHOD =====");

        String fruits = "Apple,Banana,Orange";

        String[] fruitArray = fruits.split(",");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        System.out.println("\n===== SPLITTING USING DOTS =====");

        String email = "www.google.com";

        String[] parts = email.split("\\.");

        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println("\n===== STRINGBUILDER BASICS =====");

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");

        System.out.println(sb);

        System.out.println("\n===== STRING VS STRINGBUILDER =====");

        String str1 = "Hello";
        str1 = str1 + " Java";

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");

        System.out.println(str1);
        System.out.println(builder);

        System.out.println("\n===== STRINGBUILDER VS STRINGBUFFER =====");

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuffer sb2 = new StringBuffer("Python");

        sb1.append(" Programming");
        sb2.append(" Programming");

        System.out.println(sb1);
        System.out.println(sb2);

        System.out.println("\n===== APPEND METHOD =====");

        StringBuilder append = new StringBuilder("Hello");

        append.append(" World");

        System.out.println(append);

        System.out.println("\n===== INSERT METHOD =====");

        StringBuilder insert = new StringBuilder("Hello");

        insert.insert(5, " Java");

        System.out.println(insert);

        System.out.println("\n===== DELETE METHOD =====");

        StringBuilder delete = new StringBuilder("Hello Java");

        delete.delete(5, 10);

        System.out.println(delete);

        System.out.println("\n===== REVERSE METHOD =====");

        StringBuilder reverse = new StringBuilder("Java");

        System.out.println(reverse.reverse());

        System.out.println("\n===== REVERSE A STRING =====");

        String original = "Hello";

        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        System.out.println("\n===== PALINDROME STRING =====");

        String palindrome = "madam";

        String reversedPalindrome =
                new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(reversedPalindrome)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println("\n===== COUNT WORDS =====");

        String words = "Java is easy to learn";

        String[] wordArray = words.trim().split("\\s+");

        System.out.println("Word Count: " + wordArray.length);

        System.out.println("\n===== REMOVE ALL WHITESPACE =====");

        String whiteSpace = "Java is very easy";

        String noSpace = whiteSpace.replaceAll("\\s+", "");

        System.out.println(noSpace);
    }
}
