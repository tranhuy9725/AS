package designPattern.adapterPattern.Bai2;

public class PaymentAdapter implements PaymentService{
    private PayPalService payPalService;
    private StripeService  stripeService;

    @Override
    public void chosePaymentService(String paymentService) {
        if(paymentService.equalsIgnoreCase("paypal")) {
            payPalService = new PayPalService();
            System.out.println("You chose paypal.");
        }else if(paymentService.equalsIgnoreCase("stripe")) {
            stripeService = new StripeService();
            System.out.println("You chose stripe.");
        }
    }
}
