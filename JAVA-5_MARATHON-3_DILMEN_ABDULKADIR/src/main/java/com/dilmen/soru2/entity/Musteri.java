package com.dilmen.soru2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Customer")
public class Musteri {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@OneToMany (mappedBy = "musteri" )
	private List<Siparis> siparisler;
	
	public Musteri() {
		
	}
	public Musteri(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Siparis> getSiparisler() {
		return siparisler;
	}
	public void setSiparisler(List<Siparis> siparisler) {
		this.siparisler = siparisler;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Musteri id : " + id + " Müşteri Ad: " + firstName + " Müşteri Soyad: " + lastName ;
	}
	
	
}
