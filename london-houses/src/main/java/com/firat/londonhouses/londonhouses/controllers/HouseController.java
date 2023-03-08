package com.firat.londonhouses.londonhouses.controllers;

import com.firat.londonhouses.londonhouses.entities.House;
import com.firat.londonhouses.londonhouses.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping
    public House saveHouse(@RequestBody House house) {
        return houseService.saveHouse(house);
    }

    @GetMapping("/search")
    public List<House> searchHouses(
            @RequestParam(required = false) String propertyName,
            @RequestParam(required = false) Integer minPrice,
            @RequestParam(required = false) Integer maxPrice,
            @RequestParam(required = false) String houseType,
            @RequestParam(required = false) Integer minAreaInSqFt,
            @RequestParam(required = false) Integer maxAreaInSqFt,
            @RequestParam(required = false) Integer numBedrooms,
            @RequestParam(required = false) Integer numBathrooms,
            @RequestParam(required = false) Integer numReceptions,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String cityCounty,
            @RequestParam(required = false) String postalCode
    ) {
        return houseService.searchHouses(
                propertyName,
                minPrice != null ? minPrice : 0,
                maxPrice != null ? maxPrice : Integer.MAX_VALUE,
                houseType,
                minAreaInSqFt != null ? minAreaInSqFt : 0,
                maxAreaInSqFt != null ? maxAreaInSqFt : Integer.MAX_VALUE,
                numBedrooms != null ? numBedrooms : 0,
                numBathrooms != null ? numBathrooms : 0,
                numReceptions != null ? numReceptions : 0,
                location,
                cityCounty,
                postalCode
        );
    }

    @GetMapping("")
    public List<House> getAll() {
        return houseService.findHouses();
    }
}
