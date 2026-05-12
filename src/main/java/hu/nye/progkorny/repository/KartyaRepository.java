package hu.nye.progkorny.repository;

import java.util.List;
import java.util.stream.Collectors;

import hu.nye.progkorny.model.Kartya;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class KartyaRepository {
    Kartya kartya1 = new Kartya(1L, "Leafeon", "grass", "sinnoh", "rare");
    Kartya kartya2 = new Kartya(2L, "Vivillon", "grass", "kalos", "common");
    Kartya kartya3 = new Kartya(3L, "Rotom", "electric", "sinnoh", "common");
    Kartya kartya4 = new Kartya(4L, "Flygon", "dragon", "hoenn", "uncommon");
    Kartya kartya5 = new Kartya(5L, "Dubwool", "normal", "galar", "rare");
    Kartya kartya6 = new Kartya(6L, "Ceruledge", "fire", "paldea", "uncommon");
    Kartya kartya7 = new Kartya(7L, "Meganium", "grass", "johto", "uncommon");
    Kartya kartya8 = new Kartya(8L, "Glimmora", "fighting", "paldea", "common");
    Kartya kartya9 = new Kartya(9L, "Chandelure", "psychic", "kalos", "common");
    Kartya kartya10 = new Kartya(10L, "Lucario", "fighting", "sinnoh", "rare");
    List<Kartya> kartyak = List.of(kartya1, kartya2, kartya3, kartya4, kartya5, kartya6, kartya7, kartya8, kartya9, kartya10);

    public List<Kartya> getAllKartya() {
        return kartyak;
    }

    public Kartya getKartyaById(@PathVariable Long id) {
        return kartyak.stream().filter(kartya -> kartya.getId().equals(id)).findFirst().get();
    }

    public List<Kartya> getKartyaByName (@PathVariable String name) {
        return kartyak.stream().filter(kartya -> kartya.getExpansion().equals(name)).collect(Collectors.toList());
    }

    public List<Kartya> getKartyaByType (@PathVariable String type) {
        return kartyak.stream().filter(kartya -> kartya.getExpansion().equals(type)).collect(Collectors.toList());
    }

    public List<Kartya> getKartyaByExpansion(@PathVariable String expansion) {
        return kartyak.stream().filter(kartya -> kartya.getExpansion().equals(expansion)).collect(Collectors.toList());
    }

    public List<Kartya> getKartyaByRarity (@PathVariable String rarity) {
        return kartyak.stream().filter(kartya -> kartya.getExpansion().equals(rarity)).collect(Collectors.toList());
    }
}
