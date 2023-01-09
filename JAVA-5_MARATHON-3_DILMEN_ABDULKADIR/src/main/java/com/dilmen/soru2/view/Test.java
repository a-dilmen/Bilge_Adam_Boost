package com.dilmen.soru2.view;

import java.util.Arrays;

import com.dilmen.soru2.entity.Musteri;
import com.dilmen.soru2.entity.Siparis;
import com.dilmen.soru2.entity.SiparisKalemi;
import com.dilmen.soru2.entity.Urun;
import com.dilmen.soru2.service.MusteriService;
import com.dilmen.soru2.service.SiparisKalemiService;
import com.dilmen.soru2.service.SiparisService;
import com.dilmen.soru2.service.UrunService;

//2C ve 2D tam çalışıyor

// Sipariş ve Sipariş kalemi entity maplemesinde bir problem olduğu için A ve B için sipariş sorgusunda 
//fiyat ve ürün gelmiyor ancak sipariş id müşteri id ve müşteri id sipariş id sorguları çalışıyor 
public class Test {
	public static void main(String[] args) {
		Musteri m1 = new Musteri("Ali", "Kaya");
		Musteri m2 = new Musteri("Veli", "Özkan");

		Urun u1 = new Urun("Iphone 11", 17000);
		Urun u2 = new Urun("Samsung S21", 18000);
		Urun u3 = new Urun("LG LED TV", 8500);
		Urun u4 = new Urun("Arçelik Süpürge", 2500);

		SiparisKalemi sk1 = new SiparisKalemi(u1, 1);
		SiparisKalemi sk2 = new SiparisKalemi(u2, 2);
		Siparis s1 = new Siparis(m1, Arrays.asList(sk1, sk2));

		SiparisKalemi sk3 = new SiparisKalemi(u2, 1);
		SiparisKalemi sk4 = new SiparisKalemi(u3, 1);
		Siparis s2 = new Siparis(m2, Arrays.asList(sk3, sk4));

		SiparisKalemi sk5 = new SiparisKalemi(u3, 1);
		Siparis s3 = new Siparis(m1, Arrays.asList(sk5));

		Siparis s4 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u1, 1)));
		Siparis s5 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u2, 1)));

		MusteriService musteriService = new MusteriService();

		musteriService.create(m1);
		musteriService.create(m2);

		UrunService urunService = new UrunService();

		urunService.create(u1);
		urunService.create(u2);
		urunService.create(u3);
		urunService.create(u4);

		SiparisKalemiService siparisKalemiService = new SiparisKalemiService();

		siparisKalemiService.create(sk1);
		siparisKalemiService.create(sk2);

		SiparisService siparisService = new SiparisService();

		siparisService.create(new Siparis(m1, Arrays.asList(sk1, sk2)));
		siparisService.create(new Siparis(m2, Arrays.asList(sk3, sk4, sk5)));
		siparisService.create(new Siparis(m1, Arrays.asList(sk5)));

		SiparisController siparisController = new SiparisController();
		siparisController.findAll();
		
		musteriService.listAll();
		
		MusteriController musteriController = new MusteriController();
		musteriController.listSiparisByCustomer();
		musteriController.findNumberOfOrdersPerCustomer2C();
		musteriController.printCustomerAndOrder2D();
		
	}
}
