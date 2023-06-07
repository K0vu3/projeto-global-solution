package br.com.bytewizards.api.entity.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public record CadastrarDoacaoDto(
        @NotBlank
        Long idDoador,
        @NotBlank
        Long IdAlimento,
        LocalDate dataValidade,
        @NotNull
        Double quantidade

) {
}
