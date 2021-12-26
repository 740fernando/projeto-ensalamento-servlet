package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static SessionFactory sf;

	static{ //static porque vai ser utilizado para o sistem a toda
		Configuration cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	public static Session getSession(){
		return sf.getCurrentSession();
	}
	public static void beginTransaction(){ //inicia a transacao
		Session session = getSession();
		session.beginTransaction();
	}
	public static void commitTransaction(){  // finaliza a transacao
		Session session = getSession();
		session.getTransaction();
	}
	public static void rollbackTransaction(){ // finaliza a transacao com falha e desfaz o que foi feito anteriormente
		Session session = getSession();
		session.getTransaction().commit();
	}
}
// detalhe = o uso do sf.getCurrentSession , como eu configurei o hibernate.cfg.xml aquela propriedade para thread,
//significa que sempre que eu chamar o sf.getCurrentSession, ele vai devolver a referencia da session atrelada
//a thread do usuario