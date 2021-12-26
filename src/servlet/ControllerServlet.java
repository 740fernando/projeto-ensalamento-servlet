package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

/**
ControllerServlet.class.getResourceAsStream("/action.properties") - Le o arquivo que está na pasta src
actions = new Properties()  - Instancia o properties
actionClass = Nome da classe

*/
public class ControllerServlet extends HttpServlet {
	
	
	private static Properties actions;
	
	static{
		try{
			InputStream is = ControllerServlet.class.getResourceAsStream("/action.properties");
			actions = new Properties();
			actions.load(is);
			is.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{	
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		String path = request.getServletPath(); // request.getServletPath() - retorna o caminho requisitado
		path = path.substring(1, path.indexOf(".")); // retorna o nomedaclasse
		
		String actionClass = actions.getProperty(path); // Obtem a propriedade que está associada ao Listar salas. Retornar o nomdaclasse.action 
		
		// valida se existe o nome da classe
		if(actionClass == null){
			throw new ServletException("A action '"+path+"' não está mapeada");
		}
		try{
			Action action = (Action) Class.forName(actionClass).newInstance(); // Cria o objeto da classe
			action.setRequest(request);
			action.setResponse(response);
			action.runAction(); // chama a abertura de transação, process e fechamento da transacao
		}catch(Exception e){
			throw new ServletException(e);
		}
	}
}
