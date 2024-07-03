package mate.prototype_Apple_reservation.entity;

import jakarta.persistence.*;

@Entity
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int password;

    @Column
    private String memo;
}
