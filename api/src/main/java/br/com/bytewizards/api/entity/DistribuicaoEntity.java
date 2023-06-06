package br.com.bytewizards.api.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_DISTRIBUICAO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistribuicaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_DISTRIBUICAO")
    private Long id;

    @Embedded
    @Column(name="ENDERECO_DISTRIBUICAO")
    private EnderecoEntity endereco;

    @Column(name="DATA_DISTRIBUICAO")
    private LocalDate data;

    @Column(name="HORA_INICIO_DISTRIBUICAO")
    private LocalTime horaInicio;

    @Column(name="HORA_FIM_DISTRIBUICAO")
    private LocalTime horaFim;

    @Column(name="ATIVO")
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name="ID_ONG")
    private OngEntity ong;

}
