package br.com.bytewizards.api.entity;

import br.com.bytewizards.api.entity.DoadorEntity;
import br.com.bytewizards.api.entity.OngEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="TB_DOACAO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_DOACAO")
    private Long id;

    @Column(name="DATA_DOACAO")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name="ID_DOADOR")
    private DoadorEntity doador;

    @ManyToOne
    @JoinColumn(name="ID_ONG")
    private OngEntity ong;

    @Column(name="ATIVO")
    private Boolean ativo;
}
