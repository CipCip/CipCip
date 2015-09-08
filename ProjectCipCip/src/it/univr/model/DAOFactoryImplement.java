package it.univr.model;


public class DAOFactoryImplement extends DAOFactory{
	
	public PositionDAOInterface getPositionDAO(){
		return new PositionDAO();
	}
	
	public CipCipDAOInterface getCipCipDAO(){
		return new CipCipDAO();
	}
	
	public HelpDAOInterface getHelpDAO(){
		return new HelpDAO();
	}
	
	public UserDAOInterface getUserDAO(){
		return new UserDAO();
	}
	public VeicoloDAOInterface getVeicoloDAO(){
		return new VeicoloDAO();
	}

}
