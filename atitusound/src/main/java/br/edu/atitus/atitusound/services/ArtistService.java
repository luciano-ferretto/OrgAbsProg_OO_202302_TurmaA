package br.edu.atitus.atitusound.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.edu.atitus.atitusound.entities.ArtistEntity;

public interface ArtistService {
	
	ArtistEntity save(ArtistEntity entidade) throws Exception;
	
	List<ArtistEntity> findAll() throws Exception;
	
	Page<List<ArtistEntity>> findByNameContainingIgnoreCase(Pageable pageable, String name) throws Exception;
	
	Optional<ArtistEntity> findById(UUID uuid) throws Exception;
	
	void deleteById(UUID uuid) throws Exception;

}
