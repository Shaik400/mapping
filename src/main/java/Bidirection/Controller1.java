package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import unidirection.Sim;
import unidirection.Whatsapp_account;

public class Controller1 {
	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Whatsapp_account w2=new Whatsapp_account();
		w2.setName("chandu3");
		w2.setPhone(123456789l);
		w2.setW_otp("we2334");
		
		Sim s=new Sim();
		s.setPhone_name("oppo");
		s.setPhone_no(123456789l);
		s.setSim_id("1234");
		
		//mapping
		s.setW(w2);
		
		
		et.begin();
		em.persist(w2);
		et.commit();
		System.out.println("one to one bidirection");
	}	
}
