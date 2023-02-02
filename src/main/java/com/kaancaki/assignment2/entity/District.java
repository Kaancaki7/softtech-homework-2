package com.kaancaki.assignment2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DISTRICT")
@Getter
@Setter
public class District {
    @Id
    @GeneratedValue(generator = "District")
    @SequenceGenerator(name = "District",sequenceName = "DISTRICT_ID_SEQ")
    private Long id;
    @Column(name = "NAME",nullable = false,length = 100)
    private String name;
    @Column(name = "ID_CITY")
    private Long cityId;

}
