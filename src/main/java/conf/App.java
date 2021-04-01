/**
 * 
 */
package conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author manon
 *
 */
@Configuration
@ComponentScan
public class App {

	/**
	 * 
	 */
	public App() {
		System.out.println("start created");
	}

}
