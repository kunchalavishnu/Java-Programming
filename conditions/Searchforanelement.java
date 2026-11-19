public class Searchforanelement {
     public static void main(String[] args) {
         int[] numbers = {1, 2, 3, 4, 5};
         int searchElement = 3;
         boolean found = false;
         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] == searchElement) {
                 found = true;
                 break;
             }
         }
         if (found) {
             System.out.println("Element " + searchElement + " is found in the array.");
         } else {
             System.out.println("Element " + searchElement + " is not found in the array.");
         }
     }
     
}
