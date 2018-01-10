package com.example.controller;

import com.example.dao.City;
import com.example.services.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityServices cityServices;

    @RequestMapping("/selectall")
    public List<City> findAll(){
        List<City> list=cityServices.SelectAll();
        return list;
    }

}
