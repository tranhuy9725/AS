package ocp;

public class CashPayment implements PaymentMode {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}
