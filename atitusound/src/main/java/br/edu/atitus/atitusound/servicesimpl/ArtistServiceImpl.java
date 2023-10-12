package br.edu.atitus.atitusound.servicesimpl;

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
	public ArtistEntity save(ArtistEntity entidade) throws Exception {
		// TODO executar validações
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

}
