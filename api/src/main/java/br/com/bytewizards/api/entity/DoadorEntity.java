package br.com.bytewizards.api.entity;

import br.com.bytewizards.api.entity.enums.TipoPessoa;
import jakarta.persistence.*;
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
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoPessoa tipo;

    private String documento;

    private String email;

    private String telefone;

    private Boolean ativo;


}
