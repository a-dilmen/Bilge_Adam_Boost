package com.dilmen.soru2.view;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import com.dilmen.soru2.entity.Musteri;
import com.dilmen.soru2.service.MusteriService;
import com.dilmen.soru2.service.SiparisKalemiService;
import com.dilmen.soru2.service.SiparisService;
import com.dilmen.soru2.service.UrunService;
import com.dilmen.soru2.utility.HibernateUtil;

import antlr.collections.List;


public class MusteriController {

	public MusteriController() {
		siparisService = new SiparisService();
		siparisKalemiService = new SiparisKalemiService();
		musteriService = new MusteriService();
		urunService = new UrunService();
	}

	SiparisService siparisService;
	SiparisKalemiService siparisKalemiService;
	MusteriService musteriService;
	UrunService urunService;

	void listSiparisByCustomer() {
		ArrayList<Musteri> list = (ArrayList<Musteri>) musteriService.listAll();
		list.stream().forEach(cus->System.out.println(cus.getSiparisler()));
	}

	void findNumberOfOrdersPerCustomer2C() {
		EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager();

		@SuppressWarnings("unchecked")
		ArrayList<Object[]> list = (ArrayList<Object[]>) entityManager
				.createNativeQuery("select musteri_id, count(order_id) from siparis group by musteri_id").getResultList();
		for (Object[] element : list) {
			System.out.println("Müşteri ID: " + element[0] + " Siparş Sayısı: " + element[1]);
		}
	}
	void printCustomerAndOrder2D() {
		EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager();

		@SuppressWarnings("unchecked")
		ArrayList<Object[]> list = (ArrayList<Object[]>) entityManager
				.createNativeQuery("select customer.first_name, customer.last_name, siparis.order_id from "
						+ " siparis join customer on customer.id = siparis.musteri_id ").getResultList();
		for (Object[] element : list) {
			System.out.println("Müşteri Ad: " + element[0] + " Müşteri Soyad: " + element[1] +" Siparş id: " + element[2]);
		}
	}

}
