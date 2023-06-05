package br.com.bytewizards.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="TB_DISTRIBUICAO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistribuicaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private EnderecoEntity endereco;

    private LocalDate data;

    private LocalTime horaInicio;

    private LocalTime horaFim;

    private Boolean ativo;

}
