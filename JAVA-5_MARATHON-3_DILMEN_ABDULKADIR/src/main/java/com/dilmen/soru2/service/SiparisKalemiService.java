package com.dilmen.soru2.service;

import java.util.List;

import com.dilmen.soru2.entity.SiparisKalemi;
import com.dilmen.soru2.repository.SiparisKalemiRepository;
import com.dilmen.soru2.repository.SiparisRepository;

public class SiparisKalemiService implements IService<SiparisKalemi> {
	public SiparisKalemiService() {
		siparisDao = new SiparisKalemiRepository();
	}

	SiparisKalemiRepository siparisDao;

	@Override
	public void create(SiparisKalemi entity) {
		siparisDao.create(entity);
	}

	@Override
	public void delete(long id) {
		siparisDao.delete(id);
	}

	@Override
	public void update(long id, SiparisKalemi entity) {
		siparisDao.update(id, entity);
	}

	@Override
	public List<SiparisKalemi> listAll() {
		return siparisDao.listAll();
	}

	@Override
	public SiparisKalemi find(long id) {
		return siparisDao.find(id);
	}

}
