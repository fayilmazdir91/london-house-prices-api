package com.firat.londonhouses.londonhouses.repos;

import com.firat.londonhouses.londonhouses.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

    // PUT endpoint: save house to database
    House save(House house);

    // GET endpoint: search for houses based on criteria
    @Query("SELECT h FROM House h " +
            "WHERE (:propertyName IS NULL OR h.propertyName = :propertyName) " +
            "AND (:minPrice IS NULL OR h.price >= :minPrice) " +
            "AND (:maxPrice IS NULL OR h.price <= :maxPrice) " +
            "AND (:houseType IS NULL OR h.houseType = :houseType) " +
            "AND (:minAreaInSqFt IS NULL OR h.areaInSqFt >= :minAreaInSqFt) " +
            "AND (:maxAreaInSqFt IS NULL OR h.areaInSqFt <= :maxAreaInSqFt) " +
            "AND (:numBedrooms IS NULL OR h.numBedrooms = :numBedrooms) " +
            "AND (:numBathrooms IS NULL OR h.numBathrooms = :numBathrooms) " +
            "AND (:numReceptions IS NULL OR h.numReceptions = :numReceptions) " +
            "AND (:location IS NULL OR h.location = :location) " +
            "AND (:cityCounty IS NULL OR h.cityCounty = :cityCounty) " +
            "AND (:postalCode IS NULL OR h.postalCode = :postalCode)")
    List<House> searchBasedOnCriteria(
            @Param("propertyName") String propertyName,
            @Param("minPrice") Integer minPrice,
            @Param("maxPrice") Integer maxPrice,
            @Param("houseType") String houseType,
            @Param("minAreaInSqFt") Integer minAreaInSqFt,
            @Param("maxAreaInSqFt") Integer maxAreaInSqFt,
            @Param("numBedrooms") Integer numBedrooms,
            @Param("numBathrooms") Integer numBathrooms,
            @Param("numReceptions") Integer numReceptions,
            @Param("location") String location,
            @Param("cityCounty") String cityCounty,
            @Param("postalCode") String postalCode
    );
}