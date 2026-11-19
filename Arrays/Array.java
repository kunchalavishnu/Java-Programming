public class Array {
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            numbers[3] = 99;
               System.out.println("Array elements:" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] );
               System.out.println("length of the array: " + numbers.length);
               System.out.println("Updated array elements:" + java.util.Arrays.toString(numbers));
    }
}