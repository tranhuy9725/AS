package designPattern.adapterPattern.Bai2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.amount(1412, "Paypal");
        client.amount(112, "Stripe");
    }
}
