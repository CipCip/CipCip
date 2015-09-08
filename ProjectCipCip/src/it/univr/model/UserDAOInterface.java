package it.univr.model;

import java.util.List;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;

public interface UserDAOInterface {

	public UserBean logIn(UserBean user, VeicoloBean car); 
	public UserBean registrazione(UserBean user, VeicoloBean car);
	public UserBean modifica(UserBean user, String emailUtente);
	public UserBean updateUtente(UserBean user, String emailP);
	public List<UserBean> getUsers(); 
	public boolean eliminaUtente(UserBean user);
	public UserBean modificaAmministratore(UserBean user, String email);
}
