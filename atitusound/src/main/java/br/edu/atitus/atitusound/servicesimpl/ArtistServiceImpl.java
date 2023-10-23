package br.edu.atitus.atitusound.servicesimpl;

import java.util.List;

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
	@Override
	public Page<List<ArtistEntity>> findByNameContainingIgnoreCase(Pageable pageable, String name) throws Exception {
		return artistRepository.findByNameContainingIgnoreCase(pageable, name);
	}

	@Override
	public ArtistEntity save(ArtistEntity entidade) throws Exception {
		if (entidade.getName() == null || entidade.getName().isEmpty())
			throw new Exception("Campo Name Inválido!");

		if (entidade.getUuid() == null) {
			if (artistRepository.existsByName(entidade.getName()))
				throw new Exception("Já existe registro com este nome!");
		} else {
			if (artistRepository.existsByNameAndUuidNot(entidade.getName(), entidade.getUuid()))
				throw new Exception("Já existe registro com este nome!");
		}
		artistRepository.save(entidade);
		return entidade;
	}

	@Override
	public List<ArtistEntity> findAll() throws Exception {
		return artistRepository.findAll();
	}



}
