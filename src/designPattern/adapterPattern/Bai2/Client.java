package designPattern.adapterPattern.Bai2;

public class Client {
    private PaymentService paymentService = new PaymentAdapter();
    public void amount(double amount, String service) {
        paymentService.chosePaymentService(service);
        System.out.println("You have paid "+ amount);
    }
}
