package dao;

//Objeto que cria objetos
// PADRÃO SINGLETON - Mecanismo que permite que uma instancia de uma determinada classe na sua aplicação, isso significa que NÃO É POSSÍVEL um código que queira usar sua factory crie varias instancias do mesmo objeto  
public class DAOFactory {
	
	private static DAOFactory instance;
	
	private DAOFactory(){ //Defino o construtor como privado, significa que eu nao posso construir objetos de DAOFactory fora da classe. 
		
	}
	// método estático responsável por verificar se a instancia é nula, caso seja, cria uma DAOfactory e retorna a instancia
	public static DAOFactory getInstance(){
		if(instance == null){
			instance = new DAOFactory();
		}
		return instance;
	}
	public AlunoDAO getAlunoDAO(){
		AlunoDAO dao = new AlunoDAO();
		return dao;
	}
	public SalaDAO getSalaDAO(){
		SalaDAO dao = new SalaDAO();
		return dao;
	}
}
//obs: atributos e metodos estaticos são compartilhados por todas classes