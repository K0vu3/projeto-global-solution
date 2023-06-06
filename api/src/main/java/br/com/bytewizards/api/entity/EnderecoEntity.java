package br.com.bytewizards.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoEntity {

    private String logradouro;

    private String numero;

    private String complemento;

    private String cep;

    private String uf;

    private String cidade;

}
