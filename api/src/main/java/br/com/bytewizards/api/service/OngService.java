package br.com.bytewizards.api.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bytewizards.api.entity.OngEntity;
import br.com.bytewizards.api.repository.OngRepository;

@Service
public class OngService {

	@Autowired
	OngRepository repository;

	public List<OngEntity> listarTodos() {
		return repository.findAll();
	}

	public OngEntity getOngById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("ONG não encontrada pelo id:" + id));
	}

	public OngEntity createOng(OngEntity ong) {
		return repository.save(ong);
	}

	public OngEntity updateOng(Long id, OngEntity ong) {
		OngEntity existingONG = repository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("Não foi possivel encotrar ONG com este id:" + id));

		existingONG.setNome(ong.getNome());
		existingONG.setEmail(ong.getEmail());

		return repository.save(existingONG);
	}

	public void deleteOng(Long id) {
		repository.deleteById(id);
	}

}
