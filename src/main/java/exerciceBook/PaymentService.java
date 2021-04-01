package exerciceBook;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	public void pay(String cbNumber, Double price) {
		System.out.println("Le paiement de " + price + "a été effectué avec votre carte " + cbNumber);
	}
}
