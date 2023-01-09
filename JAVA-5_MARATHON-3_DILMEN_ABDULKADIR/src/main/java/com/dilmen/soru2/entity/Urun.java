package com.dilmen.soru2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Urun")
public class Urun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_price")
	private double fiyat;
	@OneToOne
	private SiparisKalemi siparisKalemi;
	
	public Urun(String productName, double fiyat, SiparisKalemi siparisKalemi) {
		super();
		this.productName = productName;
		this.fiyat = fiyat;
		this.siparisKalemi = siparisKalemi;
	}
	public Urun(String productName, double fiyat) {
		super();
		this.productName = productName;
		this.fiyat = fiyat;
	}
	public Urun() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public SiparisKalemi getSiparisKalemi() {
		return siparisKalemi;
	}
	public void setSiparisKalemi(SiparisKalemi siparisKalemi) {
		this.siparisKalemi = siparisKalemi;
	}
	@Override
	public String toString() {
		return "Urun [id=" + id + ", productName=" + productName + ", fiyat=" + fiyat + ", siparisKalemi="
				+ siparisKalemi + "]";
	}

	
	
	
}
