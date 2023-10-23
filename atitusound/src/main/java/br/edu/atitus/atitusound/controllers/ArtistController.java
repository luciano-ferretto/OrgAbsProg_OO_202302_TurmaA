package br.edu.atitus.atitusound.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.atitusound.dtos.ArtistDTO;
import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.services.ArtistService;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	
	private final ArtistService artistService;
	
	public ArtistController(ArtistService artistService) {
		super();
		this.artistService = artistService;
	}

	protected ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity entidade = new ArtistEntity();
		entidade.setName(dto.getName());
		entidade.setImage(dto.getImage());
		return entidade;
	}
	
	@GetMapping
	public ResponseEntity<Page<List<ArtistEntity>>> get(@PageableDefault(page = 0, size = 10, sort = "name", direction = Direction.ASC) Pageable pageable,@RequestParam String name) {
		Page<List<ArtistEntity>> lista;
		try {
			lista = artistService.findByNameContainingIgnoreCase(pageable, name);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	public ResponseEntity<ArtistEntity> post(@RequestBody ArtistDTO dto){
		ArtistEntity entidade = convertDTO2Entity(dto);
		try {
			artistService.save(entidade);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(entidade);
	}
	

	

}
