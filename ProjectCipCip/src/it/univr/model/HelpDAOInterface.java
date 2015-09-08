package it.univr.model;

import java.util.List;

import it.univr.bean.HelpBean;

public interface HelpDAOInterface {

	public HelpBean inserisciaiuto(HelpBean help);
	public List<HelpBean> getHelp();
	public boolean deleteSelection(String id);
}
