package hu.nye.progkorny.service;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.repository.MappaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MappaService {
    public List<Mappa> getAllMappa() {
        return MappaRepository.getAllMappa();
    }

    public Mappa getMappaById(Long id) {
        return MappaRepository.getMappaById(id);
    }

    public List<Mappa> getMappaByName(String name) {
        return MappaRepository.getMappaByName(name);
    }
}
