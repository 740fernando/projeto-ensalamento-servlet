package action;

import java.util.List;

import entity.Sala;
import service.SalaService;

/*
 * process() -  Ao implementar o extend Action, se torna metodo obrigatorio para inserir na classe.
 *           -  Método responsáel por executar a logica do controller.
 *           -  Nunca interage com DAO, sempre interage com service
 */
public class ListarSalasAction extends Action {
	
	@Override
	public void process() throws Exception {
		
		SalaService salaService = serviceFactory.getSalaService(); //retorna os dados que 
		List<Sala> salas = salaService.getSalas(); //retorna a lista de salas cadastradas
		
		getRequest().setAttribute("salas",salas);
		forward("lista_salas.jsp");
	}
}
