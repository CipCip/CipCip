package it.univr.model;

//Design pattern creazionale ABSTRACT FACTORY

//gestisce la creazione degli oggetti
//dovrò poi creare un'interfaccia per ogni tipo di classe
//le classi concrete implementano queste interfacce
//tutte le factory implementano un interfaccia comune
public abstract class DAOFactory {

	public abstract PositionDAOInterface getPositionDAO();
	public abstract CipCipDAOInterface getCipCipDAO();
	public abstract HelpDAOInterface getHelpDAO();
	public abstract UserDAOInterface getUserDAO();
	public abstract VeicoloDAOInterface getVeicoloDAO();
	
	public static DAOFactory getDAOFactory(){
		return new DAOFactoryImplement();
	}
}
