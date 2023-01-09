package io.ugurh.di.payments;

public class CashPayment implements IPayment{

	@Override
	public void executePayment() {
		System.out.println("Cach payments...");
	}

}
