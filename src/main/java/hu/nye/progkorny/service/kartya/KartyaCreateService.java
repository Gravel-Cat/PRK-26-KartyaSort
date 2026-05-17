package hu.nye.progkorny.service.kartya;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.repository.KartyaRepo;
import org.springframework.stereotype.Service;

@Service
public class KartyaCreateService {
    public List<Kartya> createKartya(Long id, String name, String type, String expansion, String rarity) {
        return KartyaRepo.createKartya(id, name, type, expansion, rarity);
    }
}
