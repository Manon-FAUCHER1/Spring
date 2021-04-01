/**
 * 
 */
package conf.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import conf.User.UserService;

/**
 * @author manon
 *
 */
@Component
public class AuthenticationServicelmpl implements AuthenticationService {

	@Autowired
	private UserService userService;

	@Override
	public boolean authenticate(String login, String password) {

		return userService.checkPassword(login, password);

	}

}
