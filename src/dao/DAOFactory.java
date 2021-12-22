package dao;

//Objeto que cria objetos
// PADR�O SINGLETON - Mecanismo que permite que uma instancia de uma determinada classe na sua aplica��o, isso significa que N�O � POSS�VEL um c�digo que queira usar sua factory crie varias instancias do mesmo objeto  
public class DAOFactory {
	
	private static DAOFactory instance;
	
	private DAOFactory(){ //Defino o construtor como privado, significa que eu nao posso construir objetos de DAOFactory fora da classe. 
		
	}
	// m�todo est�tico respons�vel por verificar se a instancia � nula, caso seja, cria uma DAOfactory e retorna a instancia
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
//obs: atributos e metodos estaticos s�o compartilhados por todas classes