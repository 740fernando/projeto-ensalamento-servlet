package action;

import service.AlunoService;

public class AdicionarAlunoAction extends Action {

	@Override
	public void process() throws Exception {
		
		String nomeAluno = getRequest().getParameter("nomeAluno");
		String matricula = getRequest().getParameter("matricula");

		
		AlunoService alunoService = serviceFactory.getAlunoService();
		alunoService.adicionarAluno(matricula,nomeAluno);
		
		redirect("ProcurarAluno.action");
	}

}
