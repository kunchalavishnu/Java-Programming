import java.util.Scanner;
public class condition {
     public static void main(String[] args) {
    System.out.println("=======if condition=======");
           int a = 35;
           if (a <40) 
           System.out.println("pass");

    System.out.println("=======if else condition=======");
        int b = 20;
        if (b > 25) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        System.out.println("=======if else if condition=======");
        int c = 30;
        if (c > 30) {
            System.out.println("pass");
        } else if (c < 30) {
            System.out.println("fail");
        } else {
            System.out.println("equal");
        }

     System.out.println("=======nested if condition=======");
        int d = 35;
        if (d > 20) {
            if (d < 30) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        } 
        System.out.println("======= continue=======");
       for(int i =0; i<5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("======= multi condition=======");
        int e = 25;
        if (e > 20 && e < 30) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        System.out.println("=======logic condition=======");
        int f = 15;
        boolean result = true; 
        if (f > 10 || result) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
          System.out.println("=======switch case condition======="); 
          Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value");
            d = sc.nextInt();
          switch (d) {
            case 1:
                System.out.println("value is 10");
                break;
            case 2:
                System.out.println("value is 20");
                break;
            case 3:
                System.out.println("value is 30");
                break;
            default:
                System.out.println("value is not present");
          }

     }
}
