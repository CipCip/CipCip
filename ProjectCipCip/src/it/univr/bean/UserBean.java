package it.univr.bean;


public class UserBean
{
	private static UserBean userIstance;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private boolean valid;

	private UserBean() {
	}


	public static UserBean getInstance(){
		if (userIstance==null)
		{
		userIstance= new UserBean() ;
		}
		return userIstance;
	}

	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isValid() {
		return valid;
	}


	public void setValid(boolean valid) {
		this.valid = valid;
	}

	

}
