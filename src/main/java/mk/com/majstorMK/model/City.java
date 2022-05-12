package mk.com.majstorMK.model;

import lombok.Data;
import mk.com.majstorMK.model.Master;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<Master> masters;

    public City(String name) {
        this.name = name;
        this.masters = new ArrayList<>();
    }

    public City() {
    }
}
