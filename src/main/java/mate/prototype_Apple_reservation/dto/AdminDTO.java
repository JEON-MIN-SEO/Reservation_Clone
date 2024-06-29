package mate.prototype_Apple_reservation.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class AdminDTO {
    private Long adminId;
    private String name;
    private int password;
    private String memo;
}
