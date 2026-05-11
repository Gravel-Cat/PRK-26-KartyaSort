package hu.nye.progkorny.repository;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class KartyaRepository {
    Kartya kartya1 = new Kartya(1L, "Leafeon", "grass", "rare");
    Kartya kartya2 = new Kartya(2L, "Vivillon", "grass", "common");
    Kartya kartya3 = new Kartya(3L, "Rotom", "electric", "common");
    Kartya kartya4 = new Kartya(4L, "Flygon", "dragon", "uncommon");
    Kartya kartya5 = new Kartya(5L, "Dubwool", "normal", "rare");
    Kartya kartya6 = new Kartya(6L, "Ceruledge", "fire", "uncommon");
    Kartya kartya7 = new Kartya(7L, "Meganium", "grass", "uncommon");
    Kartya kartya8 = new Kartya(8L, "Glimmora", "fighting", "common");
    Kartya kartya9 = new Kartya(9L, "Chandelure", "psychic", "common");
    Kartya kartya10 = new Kartya(10L, "Lucario", "fighting", "rare");

    public List<Kartya> getAllKartya() {
        return List.of(kartya1, kartya2, kartya3, kartya4, kartya5, kartya6, kartya7, kartya8, kartya9, kartya10);
    }

    public Kartya getKartyaById(@PathVariable Long id) {
        List<Kartya> kartyak = List.of(kartya1, kartya2, kartya3, kartya4, kartya5, kartya6, kartya7, kartya8, kartya9, kartya10);
        return kartyak.stream().filter(kartya -> kartya.getId().equals(id)).findFirst().get();
    }

    public List<Kartya> getKartyaByExpansion(@PathVariable String expansion) {
        return switch (expansion) {
            case "johto" -> List.of(kartya7);
            case "hoenn" -> List.of(kartya4);
            case "sinnoh" -> List.of(kartya1, kartya3, kartya10);
            case "unova" -> List.of(kartya9);
            case "kalos" -> List.of(kartya2);
            case "galar" -> List.of(kartya5);
            case "paldea" -> List.of(kartya6, kartya8);
            default -> getAllKartya();
        };
    }
}
