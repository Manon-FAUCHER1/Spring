package exerciceBook;

import org.springframework.stereotype.Component;

@Component
public class EbookService implements BookService {

	@Override
	public void sendBook(String bookName) {
		System.out.println("Un lien de téléchargement du livre '" + bookName + "' vous a été envoyer par mail.");
		
	}

}
