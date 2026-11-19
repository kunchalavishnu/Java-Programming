public class Parameterized {
      String name;
    int age;

    Parameterized(String n, int a) {
        name = n;
        age = a;
    }
     public static void main(String[] args) {
        Parameterized obj = new Parameterized("Vishnu", 22);
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}
