package com.example.services;

import com.example.dao.City;
import com.example.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServices {
    @Autowired
    private CityMapper cityMapper;
    public List<City> SelectAll(){
        return  cityMapper.SelectAll();
    }

}
