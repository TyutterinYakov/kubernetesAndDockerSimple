package cats.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cats.api.dto.CatDto;
import cats.api.service.CatService;
import cats.store.entity.CatEntity;

@RestController
@RequestMapping("/cats")
public class CatController {

	private final CatService catService;
	
	@Autowired
	public CatController(CatService catService) {
		super();
		this.catService = catService;
	}

	@PostMapping("/")
	public CatEntity saveCat(CatDto catDto) {
		return catService.saveCat(catDto);
	}
	@GetMapping("/all")
	public List<CatEntity> getAllCats(){
		return catService.getAllCats();
	}
}
