package mk.com.majstorMK.DataInitializer;


import lombok.AllArgsConstructor;
import mk.com.majstorMK.dto.MasterDto;
import mk.com.majstorMK.enumerations.MasterType;
import mk.com.majstorMK.service.CityService;
import mk.com.majstorMK.service.MasterService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final CityService cityService;
    private final MasterService masterService;

    @PostConstruct
    public void init() {

        cityService.addCity("Скопје");
        cityService.addCity("Битола");
        cityService.addCity("Штип");
        cityService.addCity("Охрид");

        masterService.save(new MasterDto("Дамјан", "Бошковски", "075447837", 1L, 2, MasterType.Вулканизер,1801001450057L,"male"));
        masterService.save(new MasterDto("Петар", "Бошковски", "123456678", 2L, 3, MasterType.Вулканизер,1801001450052L,"male"));
        masterService.save(new MasterDto("Дарко", "Бошковски", "078918391", 3L, 4, MasterType.Вулканизер,1801001450053L,"male"));
        masterService.save(new MasterDto("Стефан", "Бошковски", "075321874", 3L, 5, MasterType.Вулканизер, 1801001450051L,"male"));
        masterService.save(new MasterDto("Горан", "Бошковски", "079321024", 4L, 2, MasterType.Вулканизер, 1801001450032L,"male"));
        masterService.save(new MasterDto("Дамјан", "Бошковски", "075447837", 1L, 2, MasterType.Електричар, 1801001450041L,"male"));
        masterService.save(new MasterDto("Петар", "Бошковски", "123456678", 2L, 3, MasterType.Електричар, 1801001450061L,"male"));
        masterService.save(new MasterDto("Дарко", "Бошковски", "078918391", 3L, 4, MasterType.Електричар, 1801001450072L,"male"));
        masterService.save(new MasterDto("Стефан", "Бошковски", "075321874", 3L, 5, MasterType.Електричар, 1801001450032L,"male"));
        masterService.save(new MasterDto("Горан", "Бошковски", "079321024", 4L, 2, MasterType.Електричар, 1801001450043L,"male"));
        masterService.save(new MasterDto("Мила", "Бошковска", "079321024", 4L, 5, MasterType.Електричар, 1801001450032L,"female"));
        masterService.save(new MasterDto("Љупка", "Љупковска", "079321024", 4L, 4, MasterType.Електричар, 1801001450055L,"female"));
        masterService.save(new MasterDto("Неда", "Веселинова", "079321024", 4L, 3, MasterType.Електричар, 1801001450056L,"female"));
    }

}
