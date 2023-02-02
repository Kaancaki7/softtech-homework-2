package com.kaancaki.assignment2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "STREET")
@Getter
@Setter
public class Street {
    @Id
    @GeneratedValue(generator = "Street")
    @SequenceGenerator(name = "Street",sequenceName = "STREET_ID_SEQ")
    private Long id;
    @Column(name = "NAME",length = 150,nullable = false)
    private String name;
    @Column(name = "ID_NEIGHBORHOOD")
    private Long neighborhoodId;


}
