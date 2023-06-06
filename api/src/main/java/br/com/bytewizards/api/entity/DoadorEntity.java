package br.com.bytewizards.api.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.bytewizards.api.entity.enums.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_DOADOR")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_DOADOR")
    private Long id;

    @Column(name="NM_DOADOR")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_PESSOA")
    private TipoPessoa tipo;

    @Column(name="DOCUMENTO_DOADOR")
    private String documento;

    @Column(name="EMAIL_DOADOR")
    private String email;

    @Column(name="TELEFONE_DOADOR")
    private String telefone;

    @Column(name="ATIVO")
    private Boolean ativo;

    @OneToMany(mappedBy = "doador")
    private List<AlimentoEntity> alimentos;

    @OneToMany(mappedBy = "doador")
    private List<DoacaoEntity> doacoes;


}
