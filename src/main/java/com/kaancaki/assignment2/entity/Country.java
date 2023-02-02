package com.kaancaki.assignment2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COUNTRY")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(generator = "Country")
    @SequenceGenerator(name = "Country",sequenceName = "COUNTRY_ID_SEQ")
    private Long id;
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;
    @Column(name = "CODE", length = 5, nullable = false, unique = true)
    private String code;
}
