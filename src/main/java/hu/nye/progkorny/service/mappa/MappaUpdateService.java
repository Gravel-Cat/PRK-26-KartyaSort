package hu.nye.progkorny.service.mappa;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.repository.MappaRepo;
import org.springframework.stereotype.Service;

@Service
public class MappaUpdateService {
    public List<Mappa> updateMappa(Long id, String field, String data) {
        return MappaRepo.updateMappa(id, field, data);
    }

    public List<Mappa> addKartyaToMappa(Long kartyaId, Long mappaId) {
        return MappaRepo.addKartyaToMappa(kartyaId, mappaId);
    }
}
