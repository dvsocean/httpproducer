package services;

import objects.Colt;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ColtService {

    private final Map<Long, Colt> coltMap;

    public ColtService() {
        coltMap = new HashMap<>();
        coltMap.put(1L, new Colt("1911 45. ACP"));
        coltMap.put(2L, new Colt("AR 223x7.62"));
    }

    public Colt retrieveHardware(Long id){
        return coltMap.get(id);
    }
}
