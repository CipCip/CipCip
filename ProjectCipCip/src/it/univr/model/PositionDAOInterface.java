package it.univr.model;

import java.util.List;

import it.univr.bean.PosizioniBean;

public interface PositionDAOInterface {
	
	public PosizioniBean positions(PosizioniBean pos);
	public List<PosizioniBean> getPosizioni(String targa);
	
}
