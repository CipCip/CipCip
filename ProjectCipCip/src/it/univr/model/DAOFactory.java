package it.univr.model;

//Design pattern creazionale abstract factory

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
