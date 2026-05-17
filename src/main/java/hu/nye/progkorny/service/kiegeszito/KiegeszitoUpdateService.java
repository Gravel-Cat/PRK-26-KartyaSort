package hu.nye.progkorny.service.kiegeszito;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.repository.KiegeszitoRepo;
import org.springframework.stereotype.Service;

@Service
public class KiegeszitoUpdateService {
    public List<Kiegeszito> updateKiegeszito(Long id, String field, String data) {
        return KiegeszitoRepo.updateKiegeszito(id, field, data);
    }

    public List<Kiegeszito> addKartyaToKiegeszito(Long kartyaId, Long kiegeszitoId) {
        return KiegeszitoRepo.addKartyaToKiegeszito(kartyaId, kiegeszitoId);
    }
}
