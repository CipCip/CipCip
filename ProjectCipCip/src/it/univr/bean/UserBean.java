package it.univr.bean;

public class UserBean {
	private static UserBean userIstance;
	private String email;
	private String password;
	private String nome;
	private String cognome;
	private String cellulare;
	// private int amministratore;
	private boolean valid;

	private UserBean() {
	}

	public static UserBean getInstance() {
		if (userIstance == null) {
			userIstance = new UserBean();
		}
		return userIstance;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
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
		this.nome = nome;
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

/*	public int getAmministratore() {
		// intanto lo lascio cos� poi penser� ad un modo pi� funzionale
		return amministratore;
	}

	public void setAmministratore(int amministratore) {
		this.amministratore = amministratore;
	}
*/
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
