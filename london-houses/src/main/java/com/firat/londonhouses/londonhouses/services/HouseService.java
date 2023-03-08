package com.firat.londonhouses.londonhouses.services;

import com.firat.londonhouses.londonhouses.entities.House;
import com.firat.londonhouses.londonhouses.repos.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;

    public House saveHouse(House house) {
        return houseRepository.save(house);
    }

    public List<House> searchHouses(
            String propertyName,
            int minPrice,
            int maxPrice,
            String houseType,
            int minAreaInSqFt,
            int maxAreaInSqFt,
            int numBedrooms,
            int numBathrooms,
            int numReceptions,
            String location,
            String cityCounty,
            String postalCode
    ) {
        return houseRepository.searchBasedOnCriteria(
                propertyName,
                minPrice,
                maxPrice,
                houseType,
                minAreaInSqFt,
                maxAreaInSqFt,
                numBedrooms,
                numBathrooms,
                numReceptions,
                location,
                cityCounty,
                postalCode
        );
    }

    public List<House> findHouses() {
        return houseRepository.findAll();
    }
}
