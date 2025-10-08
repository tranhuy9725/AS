package ocp;

import ocp.CashPayment;
import ocp.CreditCardPayment;
import ocp.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor cashProcessor = new PaymentProcessor(new CashPayment());
        cashProcessor.process(100);

        PaymentProcessor cardProcessor = new PaymentProcessor(new CreditCardPayment());
        cardProcessor.process(250);
    }
}