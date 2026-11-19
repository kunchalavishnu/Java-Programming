public class DataTypes {
    String name = "VISHNU";
    public static void main(String[] args) {
System.out.println("=========== DATA TYPES==========");
        int a = 1000;
        float b = 200.5f;
        char c = 'A';
        boolean d = true;
        String e = "Java";
        double f = 100.5;
        long g = 1000000L;
        byte h = 100;
     System.out.println("Integer: " + a);
     System.out.println("Float: " + b);
     System.out.println("Character: " + c);
     System.out.println("Boolean: " + d);
     System.out.println("String: " + e);
     System.out.println("Double: " + f);
     System.out.println("Long: " + g);
     System.out.println("Byte: " + h);

System.out.println("=========== ARRAY==========");

    int[] array = {1, 2, 3, 4, 5};
     {
    System.out.println("ARRAY:" + array[4]);

System.out.println("=========== WIDENING CASTING==========");

        int x = 200;
        double y =x;
    System.out.println("Widening Casting: " + y);

        
System.out.println("=========== NARROWING CASTING==========");

       double roy = 100.56;
       int result =(int) roy;
    System.out.println("Type Casting: " + result);

System.out.println("=========== INSTANCE VARIABLES==========");

          String s1 = new String();
          s1 = "VISHNU";
    System.out.println("Instance Variable: " + s1);
    }

    }
}
