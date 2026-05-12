package hu.nye.progkorny.repository;

import java.util.List;
import java.util.stream.Collectors;

import hu.nye.progkorny.model.Kartya;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class KartyaRepo {
    static Kartya kartya1 = new Kartya(1L, "Leafeon", "grass", "sinnoh", "rare");
    static Kartya kartya2 = new Kartya(2L, "Vivillon", "grass", "kalos", "common");
    static Kartya kartya3 = new Kartya(3L, "Rotom", "electric", "sinnoh", "common");
    static Kartya kartya4 = new Kartya(4L, "Flygon", "dragon", "hoenn", "uncommon");
    static Kartya kartya5 = new Kartya(5L, "Dubwool", "normal", "galar", "rare");
    static Kartya kartya6 = new Kartya(6L, "Ceruledge", "fire", "paldea", "uncommon");
    static Kartya kartya7 = new Kartya(7L, "Meganium", "grass", "johto", "uncommon");
    static Kartya kartya8 = new Kartya(8L, "Glimmora", "fighting", "paldea", "common");
    static Kartya kartya9 = new Kartya(9L, "Chandelure", "psychic", "unova", "common");
    static Kartya kartya10 = new Kartya(10L, "Lucario", "fighting", "sinnoh", "rare");
    static List<Kartya> kartyak = List.of(kartya1, kartya2, kartya3, kartya4, kartya5, kartya6, kartya7, kartya8, kartya9, kartya10);

    public static List<Kartya> getAllKartya() {
        return kartyak;
    }

    public static Kartya getKartyaById(@PathVariable Long id) {
        return kartyak.stream().filter(kartya -> kartya.getId().equals(id)).findFirst().get();
    }

    public static List<Kartya> getKartyaByName(@PathVariable String name) {
        return kartyak.stream().filter(kartya -> kartya.getName().equals(name)).collect(Collectors.toList());
    }

    public static List<Kartya> getKartyaByType(@PathVariable String type) {
        return kartyak.stream().filter(kartya -> kartya.getType().equals(type)).collect(Collectors.toList());
    }

    public static List<Kartya> getKartyaByExpansion(@PathVariable String expansion) {
        return kartyak.stream().filter(kartya -> kartya.getExpansion().equals(expansion)).collect(Collectors.toList());
    }

    public static List<Kartya> getKartyaByRarity(@PathVariable String rarity) {
        return kartyak.stream().filter(kartya -> kartya.getRarity().equals(rarity)).collect(Collectors.toList());
    }
}
