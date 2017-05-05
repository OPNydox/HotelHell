package com.social.repositories;

import com.social.entities.RealEstate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends CrudRepository<RealEstate, Long> {

    List<RealEstate> findAll();

    @Query(value = "SELECT h FROM RealEstate AS h WHERE h.location= ?1")
    List<RealEstate> findAllByLocation(String location);
}
