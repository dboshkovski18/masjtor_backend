package mk.com.majstorMK.model;

import lombok.Data;
import mk.com.majstorMK.enumerations.MasterType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@Entity
public class Master {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String number;

    private Long embg;

    private String gender;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private City city;

    private Integer rating;

    @Enumerated(EnumType.STRING)
    private MasterType type;

    public Master(String name, String surname, String number, City city, MasterType type,Integer rating,Long embg,String gender) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.city = city;
        this.type = type;
        this.rating = rating;
        this.embg = embg;
        this.gender = gender;
    }

    public Master() {
    }
}
