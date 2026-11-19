
import java.util.Scanner;

public class ravi {
    public static void main(String[] args) {
        System.out.println("============Scanner class============");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();
    }
}
