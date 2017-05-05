package com.social.servicesImpl;

import com.social.entities.RealEstate;
import com.social.repositories.RealEstateRepository;
import com.social.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private RealEstateRepository realEstateRepository;

    @Override
    public List<RealEstate> getAllHotels() {
        return realEstateRepository.findAll();
    }
}
