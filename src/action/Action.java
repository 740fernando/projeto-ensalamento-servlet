package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.ServiceFactory;
import util.HibernateUtil;

public abstract class Action {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	protected ServiceFactory serviceFactory;
	
	protected Action(){
		this.serviceFactory= ServiceFactory.getInstance();
	}
	
	public void runAction () throws Exception{
		
		try{
			HibernateUtil.beginTransaction();
			process();
			HibernateUtil.commitTransaction();
		}catch(Exception e ){			
			HibernateUtil.rollbackTransaction();	
			throw e;
		}		
	}
	public abstract void process() throws Exception; 
	
	protected void forward(String path)throws Exception{
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void redirect(String path) throws Exception{
		String contextRoot = request.getContextPath();
		response.sendRedirect(contextRoot+"/"+path);
	}
	protected HttpSession getSession(){
		return request.getSession();
	}
	protected HttpServletRequest getRequest(){
		return request;
	}
	public void setRequest(HttpServletRequest request){
		this.request = request;
	}
	protected HttpServletResponse getResponse(){
		return response;
	}
	public void setResponse(HttpServletResponse response){
		this.response = response;
	}
}
/**
Metodo process - é um metodo abstrato na classe action, TODAS as classes ACTION DEVEM IMPLEMENTAR ESSE METODO

Metodo runAction - Toda vez, antes que uma action ser executado, é chamado  HibernateUtil.beginTransaction();, isso 
faz com que seja aberta um session do Hibernate/Transação,  com essa transação em aberto,eu chamo o método process,
como ele é abstrato, o processo que será chamado que está extendendo essa classe action, no caso será ListarSalasAction 
 
 
 */

