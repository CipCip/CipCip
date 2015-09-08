package it.univr.model;

import it.univr.bean.UserBean;
import it.univr.bean.VeicoloBean;

public interface VeicoloDAOInterface {

	public VeicoloBean inserimento(VeicoloBean car, String targa, String email);
	public VeicoloBean modifica(VeicoloBean car, String targa);
	public boolean rimuoviVeicolo(String targaUtente);
	public VeicoloBean listaVeicolo(VeicoloBean car, String targaUtente);
	public VeicoloBean updateVeicolo(VeicoloBean car, String targa);
	public VeicoloBean selezionaVeicolo(UserBean user,VeicoloBean car);
	public boolean eliminaVeicolo(VeicoloBean car);
}
