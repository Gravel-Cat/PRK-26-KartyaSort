package hu.nye.progkorny.service.mappa;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.repository.MappaRepo;
import org.springframework.stereotype.Service;

@Service
public class MappaCreateService {
    public List<Mappa> createMappa(Long id, String name) {
        return MappaRepo.createMappa(id, name);
    }
}
