package br.com.bytewizards.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
