package service;

import dao.DAOFactory;

// Respons�vel por processar alguma l�gica de neg�cio da sua aplica��o
public class Service {
	
	protected ServiceFactory serviceFactory;
	protected DAOFactory daoFactory;
	
	protected Service(){
		this.serviceFactory = serviceFactory.getInstance();
		this.daoFactory = DAOFactory.getInstance();
	}
}
