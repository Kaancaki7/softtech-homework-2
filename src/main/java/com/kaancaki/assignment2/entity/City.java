package com.kaancaki.assignment2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CITY")
@Getter
@Setter
public class City {
    @Id
    @GeneratedValue(generator = "City")
    @SequenceGenerator(name = "City",sequenceName = "CITY_ID_SEQ")
    private Long id;
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Column(name = "PLATE_CODE", nullable = false, length = 5)
    private String plateCode;
    @Column(name = "ID_COUNTRY")
    private Long countryId;
}
