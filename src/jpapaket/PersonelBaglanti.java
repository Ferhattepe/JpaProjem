package jpapaket;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;


public class PersonelBaglanti implements PersonelBaglantiInterface {

	private EntityManager entitiManager;
	
	public PersonelBaglanti(EntityManager entitiManager) {
		this.entitiManager = entitiManager;
	}

	@Override
	public boolean personelEkle(String isim, String soyisim, int yas, int maas) {
		Personel personel = new Personel(isim, soyisim,yas,maas);
		EntityTransaction trans = entitiManager.getTransaction();
		trans.begin();
		entitiManager.persist(personel);
		trans.commit();
		return true;
	}

	@Override
	public Personel personelBul(int id) {
		Personel arananPersonel = entitiManager.find(Personel.class, id); 
		return arananPersonel;
	}

	@Override
	public List<Personel> tumPersonelleriGetir() {
		TypedQuery<Personel> result = entitiManager.createQuery("Select e from Personel e", Personel.class);
		return result.getResultList();
	}

	@Override
	public void personelSil(int id) {
		EntityTransaction trans = entitiManager.getTransaction();
		trans.begin();
		Personel personel = personelBul(id);
		if (personel != null) {
			entitiManager.remove(personel);
		}
		trans.commit();
	}

	@Override
	public void personelMaasGuncelle(int id, int artisMiktari) {
		EntityTransaction trans = entitiManager.getTransaction();
		trans.begin();
		Personel personel =personelBul(id);
		if (personel != null) {
			personel.setMaas(personel.getMaas() + artisMiktari);
		}
		trans.commit();
		
	}

}
