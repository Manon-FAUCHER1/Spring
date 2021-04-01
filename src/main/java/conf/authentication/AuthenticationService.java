/**
 * 
 */
package conf.authentication;


/**
 * @author manon
 *
 */
public interface AuthenticationService {

	boolean authenticate(String login, String password);

}
