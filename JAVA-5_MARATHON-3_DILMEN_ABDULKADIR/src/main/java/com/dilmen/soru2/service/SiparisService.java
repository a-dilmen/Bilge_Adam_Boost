package com.dilmen.soru2.service;

import java.util.List;

import com.dilmen.soru2.entity.Siparis;
import com.dilmen.soru2.repository.SiparisRepository;

public class SiparisService implements IService<Siparis> {
	public SiparisService() {
		siparisDao = new SiparisRepository();
	}

	SiparisRepository siparisDao;

	@Override
	public void create(Siparis entity) {
		siparisDao.create(entity);
	}

	@Override
	public void delete(long id) {
		siparisDao.delete(id);
	}

	@Override
	public void update(long id, Siparis entity) {
		siparisDao.update(id, entity);
	}

	@Override
	public List<Siparis> listAll() {
		return siparisDao.listAll();
	}

	@Override
	public Siparis find(long id) {
		return siparisDao.find(id);
	}

}
