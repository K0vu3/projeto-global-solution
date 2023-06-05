package br.com.bytewizards.api.entity;

import br.com.bytewizards.api.entity.enums.TipoAlimento;
import br.com.bytewizards.api.entity.enums.UnidadeMedida;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="TB_ALIMENTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoAlimento tipo;

    private Double quantidade;

    private UnidadeMedida unidadeMedida;

    private LocalDate dataValidade;

    private Boolean ativo;





}
