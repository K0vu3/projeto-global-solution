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
    private Long id;

    private LocalDate data;

//    private DoadorEntity doador;

//    private OngEntity ong;

    private Boolean ativo;
}
