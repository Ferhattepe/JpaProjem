package jpapaket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String isim;
	private String soyisim;
	private int yas;
	private int maas;
	
	public Personel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personel(String isim, String soyisim, int yas, int maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
		this.maas = maas;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	
	
	
}
