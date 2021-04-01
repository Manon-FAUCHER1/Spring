/**
 * 
 */
package conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import conf.authentication.AuthenticationService;

/**
 * @author manon
 *
 */
public class Luncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		AuthenticationService auth = context.getBean(AuthenticationService.class);
		
		boolean result = auth.authenticate("Manon", "1234");
		
		System.out.println(result);

	}

}
