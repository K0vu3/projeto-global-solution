package br.com.bytewizards.api.repository;

import br.com.bytewizards.api.entity.DistribuicaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribuicaoRepository extends JpaRepository<Long, DistribuicaoEntity> {


}
