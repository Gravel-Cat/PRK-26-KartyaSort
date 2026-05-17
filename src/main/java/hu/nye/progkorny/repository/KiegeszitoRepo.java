package hu.nye.progkorny.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import hu.nye.progkorny.model.Kartya;
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

    // CREATE methods
    public static List<Kiegeszito> createKiegeszito(@PathVariable Long id, @PathVariable String name, @PathVariable int size) {
        List<Kiegeszito> tempKiegeszitok = new ArrayList<>(kiegeszitok);
        tempKiegeszitok.add(new Kiegeszito(id, name, size, new ArrayList<>()));
        kiegeszitok = tempKiegeszitok;
        return kiegeszitok;
    }

    // READ methods
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

    // UPDATE methods
    public static List<Kiegeszito> updateKiegeszito(@PathVariable Long id, @PathVariable String field, @PathVariable String data) {
        int index = 0;
        for (int i = 0; i < kiegeszitok.toArray().length; i++) {
            if (Objects.equals(kiegeszitok.get(i).getId(), id)) {
                index = i;
                break;
            }
        }
        switch (field) {
            case "id":
                kiegeszitok.get(index).setId(Long.valueOf(data));
                break;
            case "name":
                kiegeszitok.get(index).setName(data);
                break;
            case "size":
                kiegeszitok.get(index).setSize(Integer.parseInt(data));
                break;
            default:
                break;
        }
        return kiegeszitok;
    }

    public static List<Kiegeszito> addKartyaToKiegeszito(@PathVariable Long kartyaId, @PathVariable Long kiegeszitoId) {
        List<Kartya> tempKartyak = new ArrayList<>(getKiegeszitoById(kiegeszitoId).getCards());
        tempKartyak.add(KartyaRepo.getKartyaById(kartyaId));
        getKiegeszitoById(kiegeszitoId).setCards(tempKartyak);
        return kiegeszitok;
    }

    // DELETE methods
    public static List<Kiegeszito> deleteKiegeszitoById(@PathVariable Long id) {
        kiegeszitok = kiegeszitok.stream().filter(kiegeszitok -> !kiegeszitok.getId().equals(id)).collect(Collectors.toList());
        return kiegeszitok;
    }

    public static List<Kiegeszito> deleteKiegeszitoByName(@PathVariable String name) {
        kiegeszitok = kiegeszitok.stream().filter(kiegeszitok -> !kiegeszitok.getName().equals(name)).collect(Collectors.toList());
        return kiegeszitok;
    }

    public static List<Kiegeszito> deleteKiegeszitoBySize(@PathVariable int size) {
        kiegeszitok = kiegeszitok.stream().filter(kiegeszitok -> !(kiegeszitok.getSize() == size)).collect(Collectors.toList());
        return kiegeszitok;
    }

}
