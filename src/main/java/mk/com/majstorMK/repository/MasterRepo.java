package mk.com.majstorMK.repository;

import mk.com.majstorMK.enumerations.MasterType;
import mk.com.majstorMK.model.City;
import mk.com.majstorMK.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterRepo extends JpaRepository<Master, Long> {

    List<Master> findAllByTypeAndCityIdOrderByRatingDesc(MasterType type,Long cityId);

    List<Master> findTopByRating(Integer rating);

    List<Master> findAllByTypeOrderByRatingDesc(MasterType type);

    List<Master> findAllByCityIdOrderByRatingDesc(Long cityId);

    List<Master> findByOrderByRatingDesc();

    List<Master> findMastersByNameContains(String search);


}
