package ocp;

public class PaymentProcessor {
    private final PaymentMode paymentMode;

    public PaymentProcessor(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void process(double amount) {
        paymentMode.pay(amount);
    }
}
