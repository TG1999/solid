package O;

//Software entities should be open for extension but closed for modification.

// ANTI PATTERN

//- Breaking Existing Functionality
//- Modifications to existing code require thorough testing to ensure that the changes haven't introduced regressions or errors
//- Modifying existing classes to add new functionality can make the code less flexible and makes it hard to add new functionalities


//It promotes code reusability and reduces the risk of introducing bugs when modifying existing code.
interface Payment {
}

class CreditCardPayment implements Payment {

}

class PayPalPayment implements Payment {

}

class PaymentProcessorAntiPattern {
    public void processPayment(Payment payment) {
        if (payment instanceof CreditCardPayment) {
            // Process credit card payment
        } else if (payment instanceof PayPalPayment) {
            // Process PayPal payment
        }
        // More conditions for other payment types...
    }
}

interface PaymentProcessor {
    void processPayment(Payment payment);
}

class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Payment payment) {
        // Process credit card payment
    }
}

class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Payment payment) {
        // Process PayPal payment
    }
}

