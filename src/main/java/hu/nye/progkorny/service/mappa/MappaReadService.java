package hu.nye.progkorny.service.mappa;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.repository.MappaRepo;
import org.springframework.stereotype.Service;

@Service
public class MappaReadService {
    public List<Mappa> getAllMappa() {
        return MappaRepo.getAllMappa();
    }

    public Mappa getMappaById(Long id) {
        return MappaRepo.getMappaById(id);
    }

    public List<Mappa> getMappaByName(String name) {
        return MappaRepo.getMappaByName(name);
    }
}
