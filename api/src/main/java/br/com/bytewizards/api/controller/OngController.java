package br.com.bytewizards.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytewizards.api.entity.OngEntity;
import br.com.bytewizards.api.service.OngService;

@RestController
@RequestMapping("/api/v1/ong")
public class OngController {

	@Autowired
	OngService service;

	@GetMapping
	public List<OngEntity> getAllOngs() {
		return service.getAllOngs();
	}

	@GetMapping("/{id}")
	public OngEntity getOngById(@PathVariable Long id) {
		return service.getOngById(id);
	}

	@PostMapping
	public OngEntity createOng(@RequestBody OngEntity ong) {
		return service.createOng(ong);
	}

	@PutMapping("/{id}")
	public OngEntity updateOng(@PathVariable Long id, @RequestBody OngEntity ong) {
		return service.updateOng(id, ong);
	}

	@DeleteMapping("/{id}")
	public void deleteOng(@PathVariable Long id) {
		service.deleteOng(id);
	}

}
