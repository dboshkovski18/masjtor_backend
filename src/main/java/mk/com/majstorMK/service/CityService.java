package mk.com.majstorMK.service;

import mk.com.majstorMK.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<City> listAll();

    Optional<City> addCity(String name);

    void deleteCityById(Long id);

}
