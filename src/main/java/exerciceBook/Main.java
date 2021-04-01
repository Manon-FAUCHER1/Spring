package exerciceBook;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Book.class);
		
		BookStoreService bookStore = context.getBean(BookStoreService.class);

		bookStore.buy("Le Calice du vent", 16.49, "3651 2658 6354 7896");
		
	}

}
