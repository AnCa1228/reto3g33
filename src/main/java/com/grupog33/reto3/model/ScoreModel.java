package com.grupog33.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_score")
    private int idScore;

    @Column(name = "vvalue")
    private Float value;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_reservation", nullable = false, unique = true)
    private ReservationModel reservation;
}
