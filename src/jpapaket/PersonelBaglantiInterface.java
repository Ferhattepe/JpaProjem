package jpapaket;

import java.util.List;


public interface PersonelBaglantiInterface {
	
	public boolean personelEkle(String isim, String soyisim, int yas,int maas);

	public Personel personelBul(int id);

	public List<Personel> tumPersonelleriGetir();

	public void personelSil(int id);

	public void personelMaasGuncelle(int id, int artisMiktari);
}
