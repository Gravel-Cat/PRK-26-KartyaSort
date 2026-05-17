package hu.nye.progkorny.service.kartya;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.repository.KartyaRepo;
import org.springframework.stereotype.Service;

@Service
public class KartyaDeleteService {
    public List<Kartya> deleteKartyaById(Long id) {
        return KartyaRepo.deleteKartyaById(id);
    }

    public List<Kartya> deleteKartyaByName(String name) {
        return KartyaRepo.deleteKartyaByName(name);
    }

    public List<Kartya> deleteKartyaByType(String type) {
        return KartyaRepo.deleteKartyaByType(type);
    }

    public List<Kartya> deleteKartyaByExpansion(String expansion) {
        return KartyaRepo.deleteKartyaByExpansion(expansion);
    }

    public List<Kartya> deleteKartyaByRarity(String rarity) {
        return KartyaRepo.deleteKartyaByRarity(rarity);
    }
}
