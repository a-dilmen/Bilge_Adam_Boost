package com.dilmen.soru2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Siparis")
public class Siparis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int id;

	@ManyToOne
	private Musteri musteri;
	
	@OneToMany (mappedBy = "siparis")
	private List<SiparisKalemi> siparisKalemi;

	public Siparis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Siparis(Musteri musteri, List<SiparisKalemi> siparisKalemi) {
		super();
		this.musteri = musteri;
		this.siparisKalemi = siparisKalemi;
	}

	public Siparis(int id, Musteri musteri, List<SiparisKalemi> siparisKalemi) {
		super();
		this.id = id;
		this.musteri = musteri;
		this.siparisKalemi = siparisKalemi;
	}
	
	@Override
	public String toString() {
		return "Siparis id: " + id  + " "+musteri ;
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public List<SiparisKalemi> getSiparisKalemi() {
		return siparisKalemi;
	}

	public void setSiparisKalemi(List<SiparisKalemi> siparisKalemi) {
		this.siparisKalemi = siparisKalemi;
	}

	
}
