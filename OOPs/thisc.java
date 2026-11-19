public class thisc {
     String name;
     int age;
    thisc(String n, int a) {
        this.name = n;
            this.age = a;
     }
     public static void main(String[] args) {
         thisc obj = new thisc("Vishnu", 22);
         System.out.println("Name: " + obj.name);
         System.out.println("Age: " + obj.age);
     }
}
