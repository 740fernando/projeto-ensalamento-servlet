import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// classe criada para cria��o de tabelas
public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
	}
}
