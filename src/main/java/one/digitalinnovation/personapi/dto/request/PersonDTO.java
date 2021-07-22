package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Phone;
import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 80)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 80)
    private String lastName;

    @NotEmpty
    @CPF(message = "CPF inválido! Formatação correta: 000.000.000-00")
    private String cpf;

    private String birthDate;

    @NotEmpty
    @Valid
    private List<PhoneDTO> phones;
}
