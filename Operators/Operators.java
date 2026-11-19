public class Operators {
    public static void main(String[] args) {
     System.out.println("======== Arithmetic Operators ========");

     int a =100;
     int b = 200;
     System.out.println("Addition: " + (a + b));
     System.out.println("Subtraction: " + (a - b));
     System.out.println("Multiplication: " + (a * b));
     System.out.println("Division: " + (a / b));
     System.out.println("Modulus: " + (a % b));
     System.out.println("======== Relational Operators ========");
     System.out.println("a == b: " + (a == b));
     System.out.println("a != b: " + (a != b));
     System.out.println("a > b: " + (a > b)); 
     System.out.println("a < b: " + (a < b));
     System.out.println("a >= b: " + (a >= b));
     System.out.println("a <= b: " + (a <= b));
     System.out.println("======== Logical Operators ========");
     System.out.println("a > 50 && b < 300: " + (a > 50 && b < 300));
     System.out.println("a > 120|| b < 50: " + (a > 120 || b < 50));
     System.out.println("!(a > 50): " + !(a > 50));
     System.out.println("======== Assignment Operators ========");
     System.out.println("a += 50: " + (a += 50));
     System.out.println("a -= 50: " + (a -= 50));
     System.out.println("a *= 2: " + (a *= 2));
     System.out.println("a /= 2: " + (a /= 2));
     System.out.println("a %= 2: " + (a %= 2));
     System.out.println("======== Unary Operators ========");
     int c = 10;
     System.out.println("c++: " + (c++));
     System.out.println("++c: " + (++c));
     System.out.println("c--: " + (c--));
     System.out.println("--c: " + (--c));
     System.out.println("======== Ternary Operator ========");
      String result = (a>b)? "a is greater than b" : "a is not greater than b";
      System.out.println("Result: " + result);
      
    }
  }