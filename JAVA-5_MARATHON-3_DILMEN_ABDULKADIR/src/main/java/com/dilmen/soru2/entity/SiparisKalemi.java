package com.dilmen.soru2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "siparis_kalemi")
public class SiparisKalemi {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_detail_id")
	private int id;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Urun urun;

	private int adet;

	@ManyToOne
	private Siparis siparis;

	public SiparisKalemi(Urun urun, int adet) {
		super();
		this.urun = urun;
		this.adet = adet;
	}

	public SiparisKalemi() {
		super();
	}

	public SiparisKalemi(Urun urun, int adet, Siparis siparis) {
		super();
		this.urun = urun;
		this.adet = adet;
		this.siparis = siparis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}

	@Override
	public String toString() {
		return "SiparisKalemi [id=" + id + ", urun=" + urun + ", adet=" + adet + ", siparis=" + siparis + "]";
	}
	
}
