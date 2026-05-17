package hu.nye.progkorny.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.model.Mappa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class MappaRepo {
    static Mappa mappa1 = new Mappa(1L, "Főmappa", List.of(KartyaRepo.kartya1, KartyaRepo.kartya2, KartyaRepo.kartya3, KartyaRepo.kartya4, KartyaRepo.kartya5, KartyaRepo.kartya6));
    static Mappa mappa2 = new Mappa(2L, "Mellékmappa", List.of(KartyaRepo.kartya7, KartyaRepo.kartya8, KartyaRepo.kartya9, KartyaRepo.kartya10));
    static List<Mappa> mappak = List.of(mappa1, mappa2);

    // CREATE methods
    public static List<Mappa> createMappa(@PathVariable Long id, @PathVariable String name) {
        List<Mappa> tempMappak = new ArrayList<>(mappak);
        tempMappak.add(new Mappa(id, name, new ArrayList<>()));
        mappak = tempMappak;
        return mappak;
    }

    // READ methods
    public static List<Mappa> getAllMappa() {
        return mappak;
    }

    public static Mappa getMappaById(@PathVariable Long id) {
        return mappak.stream().filter(mappa -> mappa.getId().equals(id)).findFirst().get();
    }

    public static List<Mappa> getMappaByName(@PathVariable String name) {
        return mappak.stream().filter(mappa -> mappa.getName().equals(name)).collect(Collectors.toList());
    }

    // UPDATE methods
    public static List<Mappa> updateMappa(@PathVariable Long id, @PathVariable String field, @PathVariable String data) {
        int index = 0;
        for (int i = 0; i < mappak.toArray().length; i++) {
            if (Objects.equals(mappak.get(i).getId(), id)) {
                index = i;
                break;
            }
        }
        switch (field) {
            case "id":
                mappak.get(index).setId(Long.valueOf(data));
                break;
            case "name":
                mappak.get(index).setName(data);
                break;
            default:
                break;
        }
        return mappak;
    }

    public static List<Mappa> addKartyaToMappa(@PathVariable Long kartyaId, @PathVariable Long mappaId) {
        List<Kartya> tempKartyak = new ArrayList<>(getMappaById(mappaId).getCards());
        tempKartyak.add(KartyaRepo.getKartyaById(kartyaId));
        getMappaById(mappaId).setCards(tempKartyak);
        return mappak;
    }

    // DELETE methods
    public static List<Mappa> deleteMappaById(@PathVariable Long id) {
        mappak = mappak.stream().filter(mappak -> !mappak.getId().equals(id)).collect(Collectors.toList());
        return mappak;
    }

    public static List<Mappa> deleteMappaByName(@PathVariable String name) {
        mappak = mappak.stream().filter(mappak -> !mappak.getName().equals(name)).collect(Collectors.toList());
        return mappak;
    }
}
