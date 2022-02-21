package cats.api.service;

import java.util.List;

import cats.api.dto.CatDto;
import cats.store.entity.CatEntity;

public interface CatService {

	CatEntity saveCat(CatDto catDto);
	
	List<CatEntity> getAllCats();
	
	
}
