package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
//Classe genérica- todas as classes de dao irao extender essa classe
// é definida com generics para parametrizar o tipo de dados da classe
public abstract class DAO<T> {

	private Session session;
	private Class<T> clazz; // classe que o dao genrencia
	
	protected DAO(Class<T> clazz){
		session = HibernateUtil.getSession(); // obter uma referencia da sessao atual e atribuir ao atributo session
		this.clazz=clazz;
	}
	@SuppressWarnings("unchecked")
	public T load(Serializable id) throws DAOException{ //retorna a entidade com base no id
		try{
			return (T) session.load(clazz,id);
		} catch(HibernateException e){
			throw new DAOException(e);
		}		
	}
	public void save(T obj) throws DAOException{ // salva objeto no bd
		try{
			session.save(obj);
		}catch(HibernateException e ){
			throw new DAOException (e);
		}
	}
	public void delete(T obj) throws DAOException{ //exlui objeto no bd
		try{
		   session.delete(obj);
		}catch(HibernateException e ){ //tradução de excessao- Troca uma excessao pela outra, toda vez que for lançado um HIbernateException, eu crio uma DAOEXCEPTION COM HIBERNATEEXCEPTION dentro dela
			throw new DAOException(e);
		}
	}
	protected List<?> list (String hql) throws DAOException { //metodo list- recebe um query como parametro
		try{
			Query q = session.createQuery(hql);
			return q.list();
		}catch(HibernateException e){
			throw new DAOException(e);
		}
		
	}
}
