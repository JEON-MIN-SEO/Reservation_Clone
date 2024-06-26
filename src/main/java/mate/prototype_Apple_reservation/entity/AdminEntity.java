package mate.prototype_Apple_reservation.entity;

import jakarta.persistence.*;

@Entity
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long elderlyId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int floor;
}
