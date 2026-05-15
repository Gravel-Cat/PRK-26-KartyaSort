package hu.nye.progkorny.service;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.repository.KartyaRepo;
import org.springframework.stereotype.Service;

@Service
public class KartyaUpdateService {
    public List<Kartya> updateKartya(Long id, String field, String data) {
        return KartyaRepo.updateKartya(id, field, data);
    }
}
