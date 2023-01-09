package com.dilmen.soru2.service;

import java.util.List;

import com.dilmen.soru2.entity.Urun;
import com.dilmen.soru2.repository.UrunRepository;

public class UrunService implements IService<Urun>{
	public UrunService() {
		urunDao = new UrunRepository();
	}

	UrunRepository urunDao;

	@Override
	public void create(Urun entity) {
		urunDao.create(entity);
	}

	@Override
	public void delete(long id) {
		urunDao.delete(id);
	}

	@Override
	public void update(long id, Urun entity) {
		urunDao.update(id, entity);
	}

	@Override
	public List<Urun> listAll() {
		return urunDao.listAll();
	}

	@Override
	public Urun find(long id) {
		return urunDao.find(id);
	}

}
