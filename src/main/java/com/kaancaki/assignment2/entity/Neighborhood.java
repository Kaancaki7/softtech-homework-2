package com.kaancaki.assignment2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "NEIGHBORHOOD")
@Getter
@Setter
public class Neighborhood {

    @Id
    @GeneratedValue(generator = "Neighborhood")
    @SequenceGenerator(name = "Neighborhood",sequenceName = "NEIGHBORHOOD_ID_SEQ")
    private Long id;
    @Column(name = "NAME",length = 150,nullable = false)
    private String name;
    @Column(name = "ID_DISTRICT")
    private Long districtId;
}
