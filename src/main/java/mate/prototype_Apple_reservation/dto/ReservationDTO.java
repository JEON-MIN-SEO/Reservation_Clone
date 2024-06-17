package mate.prototype_Apple_reservation.dto;

import lombok.*;
import mate.prototype_Apple_reservation.enums.MealType;
import mate.prototype_Apple_reservation.enums.ReservationType;

import javax.validation.constraints.NotNull;


import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
@Builder
public class ReservationDTO {

    private Long reservationId;

    @NotNull(message = "Elderly ID는 필수 항목입니다.")
    private Long elderlyId;

    @NotNull(message = "Guardian relation은 필수 항목입니다.")
    private String guardianRelation;

    @Builder.Default
    private ReservationType reservationType = ReservationType.DEFAULT; // 기본값 설정

    @NotNull(message = "Reservation Date는 필수 항목입니다.")
    private LocalDate reservationDate;

    @NotNull(message = "Reservation Time은 필수 항목입니다.")
    private LocalTime reservationTime;

    @Builder.Default
    private MealType meal = MealType.DEFAULT; // 기본값 설정
}
