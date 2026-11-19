public class copyof {
     public static void main(String[] args) {
         int[] a = {1, 2, 3, 4, 5};
         int[] b = java.util.Arrays.copyOf(a , a.length);
         System.out.println("Original array: " + java.util.Arrays.toString(a));
         System.out.println("Copied array: " + java.util.Arrays.toString(b));
     }
}
