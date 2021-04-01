package conf.User;

import org.springframework.stereotype.Component;

@Component
public class CheckPassword implements UserService {

	@Override
	public boolean checkPassword(String login, String password) {
		
		return login.equals("Manon") && password.equals("1234");
	}
	
}
