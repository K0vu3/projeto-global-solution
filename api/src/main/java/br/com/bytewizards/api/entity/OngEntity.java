package br.com.bytewizards.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="TB_ONG")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OngEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_ONG")
    private Long id;

    @Column(name="CNPJ_ONG")
    private String cnpj;

    @Column(name="NM_ONG")
    private String nome;

    @Embedded
    @Column(name="ENDERECO_ONG")
    private EnderecoEntity endereco;

    @Column(name="TELEFONE_ONG")
    private String telefone;

    @Column(name="EMAIL_ONG")
    private String email;

    @Column(name="ATIVO")
    private Boolean ativo;

    @OneToMany(mappedBy = "ong")
    private List<DoacaoEntity> doacoes;

    @OneToMany(mappedBy = "ong")
    private List<AlimentoEntity> alimentos;

    @OneToMany(mappedBy = "ong")
    private List<DistribuicaoEntity> distribuicoes;
}
