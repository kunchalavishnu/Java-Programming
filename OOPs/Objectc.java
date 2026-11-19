public class Objectc {
     String name = "Vishnu";
     int age = 22;
     double salary = 50000.0;
     public static void main(String[] args) {
         Objectc obj = new Objectc();
         System.out.println("Name: " + obj.name);
         System.out.println("Age: " + obj.age);
           System.out.println("Salary: " + obj.salary);
           obj.name = "Kumar";
           System.out.println("Name: " + obj.name);

}
}
