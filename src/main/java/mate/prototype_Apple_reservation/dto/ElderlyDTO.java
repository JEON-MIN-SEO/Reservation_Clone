package mate.prototype_Apple_reservation.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class ElderlyDTO {

    private Long elderlyId;

    @NotNull(message = "이름은 필수 항목입니다.")
    @Size(min = 1, max = 3, message = "이름은 1자 이상 3자 이하로 입력해야 합니다.")
    private String name;

    private Integer floor;
}
