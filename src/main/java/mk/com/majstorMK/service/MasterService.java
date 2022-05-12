package mk.com.majstorMK.service;

import mk.com.majstorMK.dto.MasterDto;
import mk.com.majstorMK.enumerations.MasterType;
import mk.com.majstorMK.model.Master;

import java.util.List;
import java.util.Optional;

public interface MasterService {

    void deleteById(Long id);

    Optional<Master> findById(Long id);

    List<Master> findAll();

    List<Master> findAllByTypeAndCity(MasterType type,Long cityId);

    List<Master> findAllByType(MasterType type);

    List<Master> findAllByCity(Long cityId);

    List<Master> findTopByRating();

    Optional<Master> save(MasterDto masterDto);

    List<MasterType> listTypes();

  //  List<Master> searchMasterByName(String search);
}
