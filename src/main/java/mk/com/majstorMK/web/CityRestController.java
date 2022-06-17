package mk.com.majstorMK.web;

import lombok.AllArgsConstructor;
import mk.com.majstorMK.model.City;
import mk.com.majstorMK.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
@CrossOrigin(origins = "https://majstor-frontend.herokuapp.com")
@AllArgsConstructor
public class CityRestController {

    private final CityService cityService;

    @GetMapping
    public List<City> listAll(){
        return cityService.listAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCity(@PathVariable Long id){
        cityService.deleteCityById(id);
    }


}
