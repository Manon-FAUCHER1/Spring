/**
 * 
 */
package exerciceBook;

import org.springframework.stereotype.Component;

@Component
public class PhysicalBookService implements BookService {

	@Override
	public void sendBook(String bookName) {
		System.out.println("Le livre '" + bookName + "' vous sera envoyé par courrier dans un délai de 48h.");
	}

}
