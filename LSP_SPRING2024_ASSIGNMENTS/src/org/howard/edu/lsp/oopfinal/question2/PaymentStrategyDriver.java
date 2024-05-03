package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using credit card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        cart.setPaymentStrategy(creditCard);
        cart.checkout(100.0);

        // Pay using PayPal
        PaymentStrategy paypal = new PayPalPayment("user@example.com");
        cart.setPaymentStrategy(paypal);
        cart.checkout(50.0);

        // Pay using Bitcoin
        PaymentStrategy bitcoin = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        cart.setPaymentStrategy(bitcoin);
        cart.checkout(75.0);
    }
}