package org.springboot.demo.service;

import org.springboot.demo.domain.City;

import java.util.List;

public interface CityService {
    City getCityInfo(String cityName);

    List<City> getAllCityInfo();

    Integer addCityInfo(City city);
}
