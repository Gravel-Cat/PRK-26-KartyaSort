package hu.nye.progkorny.repository;

import java.util.List;
import java.util.stream.Collectors;

import hu.nye.progkorny.model.Kiegeszito;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class KiegeszitoRepo {
    static Kiegeszito kiegeszito1 = new Kiegeszito(1L, "Johto", 100, KartyaRepo.getKartyaByExpansion("johto"));
    static Kiegeszito kiegeszito2 = new Kiegeszito(2L, "Hoenn", 135, KartyaRepo.getKartyaByExpansion("hoenn"));
    static Kiegeszito kiegeszito3 = new Kiegeszito(3L, "Sinnoh", 107, KartyaRepo.getKartyaByExpansion("sinnoh"));
    static Kiegeszito kiegeszito4 = new Kiegeszito(4L, "Unova", 156, KartyaRepo.getKartyaByExpansion("unova"));
    static Kiegeszito kiegeszito5 = new Kiegeszito(5L, "Kalos", 72, KartyaRepo.getKartyaByExpansion("kalos"));
    static Kiegeszito kiegeszito6 = new Kiegeszito(6L, "Galar", 96, KartyaRepo.getKartyaByExpansion("galar"));
    static Kiegeszito kiegeszito7 = new Kiegeszito(7L, "Paldea", 120, KartyaRepo.getKartyaByExpansion("paldea"));
    static List<Kiegeszito> kiegeszitok = List.of(kiegeszito1, kiegeszito2, kiegeszito3, kiegeszito4, kiegeszito5, kiegeszito6, kiegeszito7);

    public static List<Kiegeszito> getAllKiegeszito() {
        return kiegeszitok;
    }

    public static Kiegeszito getKiegeszitoById(@PathVariable Long id) {
        return kiegeszitok.stream().filter(kiegeszito -> kiegeszito.getId().equals(id)).findFirst().get();
    }

    public static List<Kiegeszito> getKiegeszitoByName(@PathVariable String name) {
        return kiegeszitok.stream().filter(kiegeszito -> kiegeszito.getName().equals(name)).collect(Collectors.toList());
    }

    public static List<Kiegeszito> getKiegeszitoBySize(@PathVariable int size) {
        return kiegeszitok.stream().filter(kiegeszito -> kiegeszito.getSize() == size).collect(Collectors.toList());
    }
}
