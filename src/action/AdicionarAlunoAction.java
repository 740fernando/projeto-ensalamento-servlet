package action;

import service.AlunoService;

public class AdicionarAlunoAction extends Action {

	@Override
	public void process() throws Exception {
		
		String nomeAluno = getRequest().getParameter("nomeAluno");
		
		AlunoService alunoService = serviceFactory.getAlunoService();
		alunoService.adicionarAluno(nomeAluno);
	}

}
