package hello;

import hello.Colt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import hello.ColtService;

@RestController
public class MilitaryController {

    private final ColtService cs;

    public MilitaryController(ColtService cs){
        this.cs = cs;
    }
    //private ColtService cs = new ColtService();

    @GetMapping("/hardware/{id}")
    public Colt locateById(@PathVariable("id") Long id){
        return cs.retrieveHardware(id);
    }


}
