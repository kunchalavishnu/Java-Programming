public class Methods {
     void display() {
         System.out.println("This is a method in the Methods class.");
     }
     void displayName() {
        System.out.println("My name is Vishnu");
     }
     void add(int a, int b) {
         System.out.println("Sum: " + (a + b));
     }
     int multiply(int a, int b) {
         return a * b;
     }

     public static void main(String[] args) {
         Methods obj = new Methods();
         obj.display();
         obj.displayName();
         obj.add(5, 10);
         int result = obj.multiply(5, 10);
         System.out.println("Product: " + result);
     }
}
