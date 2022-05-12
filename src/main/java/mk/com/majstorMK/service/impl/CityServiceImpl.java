package mk.com.majstorMK.service.impl;

import lombok.AllArgsConstructor;
import mk.com.majstorMK.model.City;
import mk.com.majstorMK.repository.CityRepo;
import mk.com.majstorMK.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepo cityRepo;

    @Override
    public List<City> listAll() {
        return cityRepo.findAll();
    }

    @Override
    public Optional<City> addCity(String name) {
        return Optional.of(cityRepo.save(new City(name)));
    }

    @Override
    public void deleteCityById(Long id) {
        cityRepo.deleteById(id);
    }
}
