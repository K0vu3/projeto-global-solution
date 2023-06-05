package br.com.bytewizards.api.repository;

import br.com.bytewizards.api.entity.OngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngRepository extends JpaRepository<Long, OngEntity> {

}
