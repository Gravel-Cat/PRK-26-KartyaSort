package hu.nye.progkorny.service;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.repository.KartyaRepository;
import org.springframework.stereotype.Service;

@Service
public class KartyaService {
    public List<Kartya> getAllKartya() {
        return KartyaRepository.getAllKartya();
    }

    public Kartya getKartyaById(Long id) {
        return KartyaRepository.getKartyaById(id);
    }

    public List<Kartya> getKartyaByName(String name) {
        return KartyaRepository.getKartyaByName(name);
    }

    public List<Kartya> getKartyaByType(String type) {
        return KartyaRepository.getKartyaByType(type);
    }

    public List<Kartya> getKartyaByExpansion(String expansion) {
        return KartyaRepository.getKartyaByExpansion(expansion);
    }

    public List<Kartya> getKartyaByRarity(String rarity) {
        return KartyaRepository.getKartyaByRarity(rarity);
    }
}
