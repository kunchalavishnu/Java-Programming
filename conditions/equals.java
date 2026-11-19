public class equals {
     public static void main(String[] args) {
         int[] a = {1, 2, 3, 4, 5};
         int[] b = {1, 2, 3, 4, 44};
         boolean isEqual = java.util.Arrays.equals(a, b);
         System.out.println("Are the two arrays equal? " + isEqual);
     }
     
}
