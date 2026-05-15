package hu.nye.progkorny.service;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.repository.MappaRepo;
import org.springframework.stereotype.Service;

@Service
public class MappaDeleteService {
    public List<Mappa> deleteMappaById(Long id) {
        return MappaRepo.deleteMappaById(id);
    }

    public List<Mappa> deleteMappaByName(String name) {
        return MappaRepo.deleteMappaByName(name);
    }
}
