package mk.com.majstorMK.service.impl;

import lombok.AllArgsConstructor;
import mk.com.majstorMK.dto.MasterDto;
import mk.com.majstorMK.enumerations.MasterType;
import mk.com.majstorMK.model.City;
import mk.com.majstorMK.model.Master;
import mk.com.majstorMK.repository.CityRepo;
import mk.com.majstorMK.repository.MasterRepo;
import mk.com.majstorMK.service.MasterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MasterServiceImpl implements MasterService {

    private final MasterRepo masterRepo;
    private final CityRepo cityRepo;

    @Override
    public void deleteById(Long id) {
        masterRepo.deleteById(id);
    }

    @Override
    public Optional<Master> findById(Long id) {
        return masterRepo.findById(id);
    }

    @Override
    public List<Master> findAll() {
        return masterRepo.findAll();
    }

    @Override
    public List<Master> findAllByTypeAndCity(MasterType type, Long cityId) {

        return masterRepo.findAllByTypeAndCityIdOrderByRatingDesc(type, cityId);
    }

    @Override
    public List<Master> findAllByType(MasterType type) {
        return masterRepo.findAllByTypeOrderByRatingDesc(type);
    }

    @Override
    public List<Master> findAllByCity(Long cityId) {
        return masterRepo.findAllByCityIdOrderByRatingDesc(cityId);
    }


    @Override
    public List<Master> findTopByRating() {

        List<Master> masters = new ArrayList<>();
        List<Master> masterList = masterRepo.findByOrderByRatingDesc();
        for(int i=0;i<4;i++){
            masters.add(masterList.get(i));
        }


        return masters;
    }

    @Override
    public Optional<Master> save(MasterDto masterDto) {
        City city = cityRepo.getById(masterDto.getCityId());

        Master master = new Master(masterDto.getName(), masterDto.getSurname(), masterDto.getNumber(), city, masterDto.getType(),masterDto.getRating(),masterDto.getEmbg(),masterDto.getGender());

        masterRepo.save(master);

        return Optional.of(master);
    }

    @Override
    public List<MasterType> listTypes() {
        return List.of(MasterType.values());
    }

//    @Override
//    public List<Master> searchMasterByName(String search) {
//        return masterRepo.findMastersByNameContains(search);
//    }
}
