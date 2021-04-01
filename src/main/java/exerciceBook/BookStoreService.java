package exerciceBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookStoreService {
	
	@Autowired
	private PaymentService payment;
	
	@Autowired
	private EbookService book;

	public void buy(String bookName, Double price, String cbNumber) {
		
		payment.pay(cbNumber, price);
		book.sendBook(bookName);
		
	}
}
