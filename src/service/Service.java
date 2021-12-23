package service;

import dao.DAOFactory;

// Responsável por processar alguma lógica de negócio da sua aplicação
public class Service {
	
	protected ServiceFactory serviceFactory;
	protected DAOFactory daoFactory;
	
	protected Service(){
		this.serviceFactory = serviceFactory.getInstance();
		this.daoFactory = DAOFactory.getInstance();
	}
}
