package hu.nye.progkorny.service;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.repository.KartyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KartyaService {
    @Autowired
    KartyaRepository kartyaRepository;

    public List<Kartya> getAllKartya() {
        return kartyaRepository.getAllKartya();
    }

    public Kartya getKartyaById(Long id) {
        return kartyaRepository.getKartyaById(id);
    }

    public List<Kartya> getKartyaByName(String name) {
        return kartyaRepository.getKartyaByName(name);
    }

    public List<Kartya> getKartyaByType(String type) {
        return kartyaRepository.getKartyaByType(type);
    }

    public List<Kartya> getKartyaByExpansion(String expansion) {
        return kartyaRepository.getKartyaByExpansion(expansion);
    }

    public List<Kartya> getKartyaByRarity(String rarity) {
        return kartyaRepository.getKartyaByRarity(rarity);
    }
}
