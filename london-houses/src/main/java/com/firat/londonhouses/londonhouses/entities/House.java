package com.firat.londonhouses.londonhouses.entities;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
@Table(name = "london_houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PROPERTY_NAME")
    private String propertyName;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "HOUSE_TYPE")
    private String houseType;

    @Column(name = "AREA_IN_SQ_FT")
    private int areaInSqFt;

    @Column(name = "NO_OF_BEDROOMS")
    private int numBedrooms;

    @Column(name = "NO_OF_BATHROOMS")
    private int numBathrooms;

    @Column(name = "NO_OF_RECEPTIONS")
    private int numReceptions;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "CITYCOUNTY")
    private String cityCounty;

    @Column(name = "POSTAL_CODE")
    private String postalCode;
}
