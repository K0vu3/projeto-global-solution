package br.com.bytewizards.api.entity;

import java.time.LocalDate;

import javax.persistence.Column;
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
