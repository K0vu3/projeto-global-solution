package br.com.bytewizards.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_ONG")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OngEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cnpj;

    private String nome;

    @Embedded
    private EnderecoEntity endereco;

    private String telefone;

    private String email;

    private Boolean ativo;
}
