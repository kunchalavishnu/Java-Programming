public class shortelement {
      public static void main(String[] args) {
          int[] numbers = {1, 2, 3, 4, 5};
          int smallest = numbers[0];
          for (int i = 1; i < numbers.length; i++) {
              if (numbers[i] < smallest) {
                  smallest = numbers[i];
              }
          }
          System.out.println("The smallest element in the array is: " + smallest);
      }     
}
