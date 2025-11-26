package designPattern.adapterPattern.Bai2;

public class StripeService {
    public void makePayment(double amount) {
        System.out.println("Stripe processing payment: $" + amount);
    }
}
