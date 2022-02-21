package cats.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cats.api.dto.CatDto;
import cats.api.service.CatService;
import cats.store.entity.CatEntity;
import cats.store.repository.CatRepository;

@Service
public class CatServiceImpl implements CatService {
	
	private final CatRepository catDao;

	@Autowired
	public CatServiceImpl(CatRepository catDao) {
		super();
		this.catDao = catDao;
	}

	@Override
	public CatEntity saveCat(CatDto catDto) {
		return catDao.saveAndFlush(new CatEntity(catDto.getName(), catDto.getBirthDay()));
	}

	@Override
	public List<CatEntity> getAllCats() {
		return catDao.findAll();
	}
	
	
}
