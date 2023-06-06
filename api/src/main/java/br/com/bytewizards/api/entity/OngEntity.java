package br.com.bytewizards.api.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_ONG")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OngEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ONG")
	private Long id;

	@Column(name = "CNPJ_ONG")
	private String cnpj;

	@Column(name = "NM_ONG")
	private String nome;

	@Embedded
	@Column(name = "ENDERECO_ONG")
	private EnderecoEntity endereco;

	@Column(name = "TELEFONE_ONG")
	private String telefone;

	@Column(name = "EMAIL_ONG")
	private String email;

	@Column(name = "ATIVO")
	private Boolean ativo;

	@OneToMany(mappedBy = "ong")
	private List<DoacaoEntity> doacoes;

	@OneToMany(mappedBy = "ong")
	private List<AlimentoEntity> alimentos;

	@OneToMany(mappedBy = "ong")
	private List<DistribuicaoEntity> distribuicoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public List<DoacaoEntity> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<DoacaoEntity> doacoes) {
		this.doacoes = doacoes;
	}

	public List<AlimentoEntity> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<AlimentoEntity> alimentos) {
		this.alimentos = alimentos;
	}

	public List<DistribuicaoEntity> getDistribuicoes() {
		return distribuicoes;
	}

	public void setDistribuicoes(List<DistribuicaoEntity> distribuicoes) {
		this.distribuicoes = distribuicoes;
	}

	public OngEntity(Long id, String cnpj, String nome, EnderecoEntity endereco, String telefone, String email,
			Boolean ativo, List<DoacaoEntity> doacoes, List<AlimentoEntity> alimentos,
			List<DistribuicaoEntity> distribuicoes) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.ativo = ativo;
		this.doacoes = doacoes;
		this.alimentos = alimentos;
		this.distribuicoes = distribuicoes;
	}

	public OngEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
