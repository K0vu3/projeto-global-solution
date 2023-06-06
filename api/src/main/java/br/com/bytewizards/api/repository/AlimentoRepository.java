package br.com.bytewizards.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bytewizards.api.entity.AlimentoEntity;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoEntity,Long> {


}
