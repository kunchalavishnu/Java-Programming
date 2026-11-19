class Person {
       private String name;
       private int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("  [Person constructor] called");
    }
        public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
       public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {                     
        this.age = age;
        } 
        else {
            System.out.println("  Invalid age ignored: " + age);
        }
    }
    void display() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
    }
}

class Student extends Person {
       private String course;
    Student(String name, int age, String course) {
       super(name, age);
       this.course = course;
        System.out.println("  [Student constructor] called");
    }
   @Override
    void display() {
        super.display();   
        System.out.println("  Course: " + course);
    }
}
   class CollegeStudent extends Student {

        private String college;

    CollegeStudent(String name, int age, String course, String college) {
        super(name, age, course); 
        this.college = college;
        System.out.println("  [CollegeStudent constructor] called");
    }
   @Override
    void display() {
        super.display();          
        System.out.println("  College: " + college);
    }
}

public class Main {
 public static void main(String[] args) {

        System.out.println("===== Constructors in multilevel inheritance ===");
        System.out.println("Creating a CollegeStudent object...");
        CollegeStudent s1 = new CollegeStudent("Vishnu", 22, "Java", "ABC College");
        System.out.println("Order: Person -> Student -> CollegeStudent (parent first)\n");

        System.out.println("===== Encapsulation, getters and setters ===");
                System.out.println("Using getters:");
        System.out.println("  Name: " + s1.getName());
        System.out.println("  Age: " + s1.getAge());

        System.out.println("Using setters:");
        s1.setName("Krishna");
        s1.setAge(23);
        s1.setAge(-5);
        System.out.println("  New Name: " + s1.getName());
        System.out.println("  New Age: " + s1.getAge() + "\n");

        System.out.println("=== Inheritance (extends) ===");
        System.out.println("CollegeStudent can call getName()");
        System.out.println("  s1 is a Person?         " + (s1 instanceof Person));
        System.out.println("  s1 is a Student?        " + (s1 instanceof Student));
        System.out.println("  s1 is a CollegeStudent? " + (s1 instanceof CollegeStudent) + "\n");

        System.out.println("===  super keyword, overriding, multilevel ===");
        System.out.println("Calling s1.display() (CollegeStudent version):");
        s1.display();

        System.out.println("\nCompare with a plain Student object:");
        Student s2 = new Student("Ravi", 20, "Python");
        s2.display();
    }
}