package br.edu.atitus.atitusound.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.services.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService{

	@Override
	public ArtistEntity save(ArtistEntity entidade) throws Exception {
		// TODO executar validações
		if (entidade.getName() == null || entidade.getName().isEmpty())
			throw new Exception("Campo Name Inválido!");
		// TODO invocar a camada repository
		return entidade;
	}

}
