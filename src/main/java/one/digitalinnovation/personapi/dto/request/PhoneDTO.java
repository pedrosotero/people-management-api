package one.digitalinnovation.personapi.dto.request;

import lombok.*;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 10, max = 14)
    private String number;
}
