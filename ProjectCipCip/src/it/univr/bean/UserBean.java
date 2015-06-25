package it.univr.bean;


public class UserBean
{
	private static UserBean userIstance;
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private String email;
	private char amministratore;
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


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome=nome;
	}



	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public char getAmministratore() {
		return amministratore;
	}


	public void setAmministratore(char amministratore) {
		this.amministratore = amministratore;
	}


	public boolean isValid() {
		return valid;
	}


	public void setValid(boolean valid) {
		this.valid = valid;
	}

	

}
