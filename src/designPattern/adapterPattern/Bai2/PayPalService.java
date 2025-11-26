package designPattern.adapterPattern.Bai2;

public class PayPalService {
    public void sendPayment(double amount) {
        System.out.println("PayPal processing payment: $" + amount);
    }
}
