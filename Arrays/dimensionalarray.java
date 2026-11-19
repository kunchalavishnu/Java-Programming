public class dimensionalarray {
     public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5};
           System.out.println("Single Dimensional Array elements: " + java.util.Arrays.toString(arr));
         int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
           System.out.println("Two Dimensional Array elements: " + java.util.Arrays.deepToString(arr2D));
           System.out.println(arr2D[0][2]);
     }
}
