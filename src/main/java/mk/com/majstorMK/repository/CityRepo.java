package mk.com.majstorMK.repository;

import mk.com.majstorMK.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepo extends JpaRepository<City, Long> {
}
