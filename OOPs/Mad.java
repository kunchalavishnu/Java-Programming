interface PaymentService {

    void pay(double amount);

    void refund(double amount);

    default void paymentStatus() {
        System.out.println("Payment is processing...");
    }

    static void paymentInfo() {
        System.out.println("Welcome to Payment Service");
    }
}

interface Transaction {

    void transactionDetails();
}

abstract class Payment {

    abstract void paymentMode();

    void message() {
        System.out.println("Payment started successfully");
    }
}

class CreditCardPayment extends Payment
        implements PaymentService, Transaction {

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit Card Refund: " + amount);
    }

    @Override
    void paymentMode() {
        System.out.println("Mode: Credit Card");
    }

    @Override
    public void transactionDetails() {
        System.out.println("Credit Card Transaction Details");
    }

    void pay(double amount, String cardNumber) {
        System.out.println("Amount: " + amount);
        System.out.println("Card Number: " + cardNumber);
    }
}

class UPIPayment extends Payment
        implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("UPI Refund: " + amount);
    }

    @Override
    void paymentMode() {
        System.out.println("Mode: UPI");
    }
}

class BankPayment extends Payment
        implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Bank Payment: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Bank Refund: " + amount);
    }

    @Override
    void paymentMode() {
        System.out.println("Mode: Bank Transfer");
    }
}

public class Mad{

    public static void main(String[] args) {

        System.out.println("===== PAYMENT SERVICE =====");

        PaymentService.paymentInfo();

        CreditCardPayment cc = new CreditCardPayment();

        System.out.println("\n--- Method Overloading ---");
        cc.pay(1000);
        cc.pay(2000, "123456789");

        System.out.println("\n--- Runtime Polymorphism ---");

        PaymentService p1 = new CreditCardPayment();
        PaymentService p2 = new UPIPayment();
        PaymentService p3 = new BankPayment();

        p1.pay(1000);
        p2.pay(2000);
        p3.pay(3000);

        System.out.println("\n--- Interface Reference ---");
        p1.paymentStatus();

        System.out.println("\n--- Abstraction ---");

        Payment a1 = new CreditCardPayment();
        Payment a2 = new UPIPayment();
        Payment a3 = new BankPayment();

        a1.paymentMode();
        a2.paymentMode();
        a3.paymentMode();

        a1.message();

        System.out.println("\n--- Multiple Interfaces ---");

        CreditCardPayment transaction = new CreditCardPayment();
        transaction.transactionDetails();

        System.out.println("\n--- Upcasting ---");

        PaymentService upcast = new UPIPayment();
        upcast.pay(500);

        System.out.println("\n--- Downcasting ---");

        if (upcast instanceof UPIPayment) {
            UPIPayment downcast = (UPIPayment) upcast;
            downcast.refund(200);
            System.out.println("Downcasting successful");
        }

        System.out.println("\n--- instanceof ---");

        System.out.println(upcast instanceof UPIPayment);
        System.out.println(upcast instanceof BankPayment);

        System.out.println("\n--- Dynamic Method Dispatch ---");

        PaymentService service;

        service = new CreditCardPayment();
        service.pay(4000);

        service = new UPIPayment();
        service.pay(5000);

        service = new BankPayment();
        service.pay(6000);
    }
}
