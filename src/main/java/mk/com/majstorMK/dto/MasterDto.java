package mk.com.majstorMK.dto;

import lombok.Data;
import mk.com.majstorMK.enumerations.MasterType;

@Data
public class MasterDto {

    private String name;

    private String surname;

    private String number;

    private Long cityId;

    private Integer rating;

    private MasterType type;

    private String gender;

    private Long embg;

    public MasterDto(String name, String surname, String number, Long cityId, Integer rating, MasterType type,Long embg,String gender) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.cityId = cityId;
        this.rating = rating;
        this.type = type;
        this.embg=embg;
        this.gender =gender;
    }
}
