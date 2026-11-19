public class Stringarray {
     public static void main(String[] args) {
         String[] names = {"vishnu" , "Ganesh", "vishnu Reddy", "teja"};
         Object[] obj = {"vishnu", 1, 2.5, 'c', true};
         System.out.println("String array elements: " + java.util.Arrays.toString(names));
         System.out.println("Object array elements: " + java.util.Arrays.toString(obj));
     }
}