package io.ugurh.di.payments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpDI implements IPayService {

	@Qualifier("cashPayment")
	private IPayment payment;

	public PayServiceImpDI(IPayment payment) {
		this.payment = payment;
	}

	@Override
	public void doPayment() {
		payment.executePayment();
	}


}
