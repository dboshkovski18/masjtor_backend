package mk.com.majstorMK.web;


import lombok.AllArgsConstructor;
import mk.com.majstorMK.dto.MasterDto;
import mk.com.majstorMK.enumerations.MasterType;
import mk.com.majstorMK.model.Master;
import mk.com.majstorMK.service.MasterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masters")
@CrossOrigin(origins = "https://majstor-frontend.herokuapp.com")
@AllArgsConstructor
public class MasterRestController {

    private final MasterService masterService;

    @PostMapping("/add")
    public ResponseEntity<Master> addMaster(@RequestBody MasterDto masterDto){
        return masterService.save(masterDto).map(master -> ResponseEntity.ok().body(master))
                .orElseGet(()-> ResponseEntity.badRequest().build());
    }

    @GetMapping("/types")
    public List<MasterType> listTypes() {
        return masterService.listTypes();
    }


    @GetMapping
    public List<Master> getAllMasters(){
        return masterService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Master> getById(@PathVariable Long id){
        return masterService.findById(id).map(master-> ResponseEntity.ok().body(master))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        masterService.deleteById(id);
    }

    @GetMapping("/sortByTypeAndCity")
    public List<Master> findByTypeAndCity (@RequestParam MasterType type,
                                           @RequestParam Long cityId){

        return masterService.findAllByTypeAndCity(type,cityId);
    }

    @GetMapping("/sortByType")
    public List<Master> findByType (@RequestParam MasterType type){

        return masterService.findAllByType(type);
    }

    @GetMapping("/sortByCity")
    public List<Master> findByType (@RequestParam Long cityId){
        return masterService.findAllByCity(cityId);
    }


    @GetMapping("/top")
    public List<Master> findTopByRating(){
        return masterService.findTopByRating();
    }

//    @GetMapping("/search")
//    public List<Master> searchMaster(@RequestParam String value){
//        return masterService.searchMasterByName(value);
//    }

}
