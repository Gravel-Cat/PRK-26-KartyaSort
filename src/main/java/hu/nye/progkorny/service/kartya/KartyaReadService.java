package hu.nye.progkorny.service.kartya;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.repository.KartyaRepo;
import org.springframework.stereotype.Service;

@Service
public class KartyaReadService {
    public List<Kartya> getAllKartya() {
        return KartyaRepo.getAllKartya();
    }

    public Kartya getKartyaById(Long id) {
        return KartyaRepo.getKartyaById(id);
    }

    public List<Kartya> getKartyaByName(String name) {
        return KartyaRepo.getKartyaByName(name);
    }

    public List<Kartya> getKartyaByType(String type) {
        return KartyaRepo.getKartyaByType(type);
    }

    public List<Kartya> getKartyaByExpansion(String expansion) {
        return KartyaRepo.getKartyaByExpansion(expansion);
    }

    public List<Kartya> getKartyaByRarity(String rarity) {
        return KartyaRepo.getKartyaByRarity(rarity);
    }
}
