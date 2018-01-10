package com.Services;

import com.Bean.City;
import com.Bean.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServices {
    @Autowired
    private CityRepository cityRepository;
    public List<City> findAll(){
       return cityRepository.findAll();
    }
    public Page<City> findAllByPage(Pageable pageable){
       return cityRepository.findAll(pageable);
    }

}
