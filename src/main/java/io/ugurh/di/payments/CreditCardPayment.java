package io.ugurh.di.payments;

public class CreditCardPayment implements IPayment{

	@Override
	public void executePayment() {
		System.out.println("Credit Card Payment...");
	}

}
