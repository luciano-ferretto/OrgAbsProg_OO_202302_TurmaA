package br.edu.atitus.atitusound.servicesimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.repositories.ArtistRepository;
import br.edu.atitus.atitusound.services.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {
	private final ArtistRepository artistRepository;

	public ArtistServiceImpl(ArtistRepository artistRepository) {
		super();
		this.artistRepository = artistRepository;
	}
	
	protected void validateFindByName(Pageable pageable, String name) throws Exception {
		
	}
	
	@Override
	public Page<List<ArtistEntity>> findByNameContainingIgnoreCase(Pageable pageable, String name) throws Exception {
		validateFindByName(pageable, name);
		return artistRepository.findByNameContainingIgnoreCase(pageable, name);
	}
	
	protected void validateSave(ArtistEntity entidade) throws Exception {
		if (entidade.getName() == null || entidade.getName().isEmpty())
			throw new Exception("Campo Name Inválido!");

		if (entidade.getUuid() == null) {
			if (artistRepository.existsByName(entidade.getName()))
				throw new Exception("Já existe registro com este nome!");
		} else {
			if (!artistRepository.existsById(entidade.getUuid()))
				throw new Exception("Registro não encontrado com este UUID");
			if (artistRepository.existsByNameAndUuidNot(entidade.getName(), entidade.getUuid()))
				throw new Exception("Já existe registro com este nome!");
		}
	}

	@Override
	public ArtistEntity save(ArtistEntity entidade) throws Exception {
		validateSave(entidade);
		artistRepository.save(entidade);
		return entidade;
	}

	@Override
	public List<ArtistEntity> findAll() throws Exception {
		return artistRepository.findAll();
	}
	protected void validateFindById(UUID uuid) throws Exception {
		
	}
	@Override
	public Optional<ArtistEntity> findById(UUID uuid) throws Exception {
		validateFindById(uuid);
		return artistRepository.findById(uuid);
	}
	protected void validateDeleteById(UUID uuid) throws Exception {
		
	}
	@Override
	public void deleteById(UUID uuid) throws Exception {
		validateDeleteById(uuid);
		artistRepository.deleteById(uuid);
	}



}
