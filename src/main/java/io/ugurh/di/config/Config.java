package io.ugurh.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import io.ugurh.di.payments.CashPayment;
import io.ugurh.di.payments.CreditCardPayment;

@Configuration
public class Config {
	
    @Bean
    public CashPayment cashPayment(){
        return new CashPayment();
    }

    @Bean
    @Primary
    public CreditCardPayment creditCardPayment(){
        return new CreditCardPayment();
    }
}
