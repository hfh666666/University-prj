package com.example.mapper;

import com.example.dao.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CityMapper {
    public List<City> SelectAll();
}
