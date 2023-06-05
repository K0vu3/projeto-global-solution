package br.com.bytewizards.api.repository;

import br.com.bytewizards.api.entity.DoadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoadorRepository extends JpaRepository<Long, DoadorEntity> {


}
