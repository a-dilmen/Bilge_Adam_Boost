package com.dilmen.soru2.view;

import java.util.ArrayList;

import com.dilmen.soru2.entity.Siparis;
import com.dilmen.soru2.service.MusteriService;
import com.dilmen.soru2.service.SiparisKalemiService;
import com.dilmen.soru2.service.SiparisService;
import com.dilmen.soru2.service.UrunService;

import antlr.collections.List;

public class SiparisController {
	
	public SiparisController() {
		siparisService = new SiparisService();
		siparisKalemiService = new SiparisKalemiService();
		musteriService = new MusteriService();
		urunService = new UrunService();
	}
	SiparisService siparisService;
	SiparisKalemiService siparisKalemiService;
	MusteriService musteriService;
	UrunService urunService;
	void createSiparis() {
		
	}
	
	void findAll() {
		ArrayList<Siparis> sips = (ArrayList<Siparis>) siparisService.listAll();
		
		sips.stream().forEach(sip-> System.out.println(sip.getSiparisKalemi()));
	}
	
	
}
