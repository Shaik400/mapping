package unidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Whatsapp_account w1=new Whatsapp_account();
		w1.setName("chandu5");
		w1.setPhone(123456789l);
		w1.setW_otp("we2334");
		
		Sim s=new Sim();
		s.setPhone_name("oppo");
		s.setPhone_no(123456789l);
		s.setSim_id("1234");
		
		//mapping
		s.setW(w1);
	
		
		
		et.begin();
		em.persist(w1);
		em.persist(s);
		et.commit();
		System.out.println("one to one unidirection");
		
	}
	
	
}
