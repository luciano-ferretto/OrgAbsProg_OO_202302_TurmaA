package br.edu.atitus.atitusound.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.entities.GenericEntity;

@NoRepositoryBean
public interface GenericRepository<TEntidade extends GenericEntity> extends JpaRepository<TEntidade, UUID>{

	boolean existsByNameAndUuidNot(String name, UUID uuid);
	
	boolean existsByName(String name);
	//select * from tb_artist where name = 'valor_parametro';
	
	Page<List<TEntidade>> findByNameContainingIgnoreCase(Pageable pageable, String name);
	
	/*
	 * default boolean existsByNameAndUuidNotOrUuidIsNull(String name, UUID uuid) {
	 * if (uuid == null) { return existsByName(name); } else { return
	 * existsByNameAndUuidNot(name, uuid); } }
	 */
}
