package model;

import javax.persistence.OneToOne;

public class UserLogin {
	
	private String username;
	
	private String password;
	
	@OneToOne
	private User user;

}
