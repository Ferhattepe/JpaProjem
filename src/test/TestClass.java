package test;

import java.security.Permissions;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpapaket.Personel;
import jpapaket.PersonelBaglanti;


public class TestClass {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("PersonelPersistenceUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		PersonelBaglanti imp = new PersonelBaglanti(em);
		
		// Maa� biraz hayali olmu� ama hayali bile g�zel :)
		imp.personelEkle("Ferhat","Tepe",23,5000);
		List<Personel> liste = imp.tumPersonelleriGetir();
		for(Personel emp:liste){
			System.out.println(emp.getId()+"."+emp.getIsim()+" "+emp.getSoyisim());
		}
		
		

	}

}
