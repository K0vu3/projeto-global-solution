package br.com.bytewizards.api.repository;

import br.com.bytewizards.api.entity.DoacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoacaoRepository extends JpaRepository<Long, DoacaoEntity> {
}
