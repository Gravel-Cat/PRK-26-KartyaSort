package hu.nye.progkorny.repository;

import java.util.List;
import java.util.stream.Collectors;

import hu.nye.progkorny.model.Mappa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class MappaRepo {
    static Mappa mappa1 = new Mappa(1L, "Főmappa", List.of(KartyaRepo.kartya1, KartyaRepo.kartya2, KartyaRepo.kartya3, KartyaRepo.kartya4, KartyaRepo.kartya5, KartyaRepo.kartya6));
    static Mappa mappa2 = new Mappa(2L, "Mellékmappa", List.of(KartyaRepo.kartya7, KartyaRepo.kartya8, KartyaRepo.kartya9, KartyaRepo.kartya10));
    static List<Mappa> mappak = List.of(mappa1, mappa2);

    public static List<Mappa> getAllMappa() {
        return mappak;
    }

    public static Mappa getMappaById(@PathVariable Long id) {
        return mappak.stream().filter(mappa -> mappa.getId().equals(id)).findFirst().get();
    }

    public static List<Mappa> getMappaByName(@PathVariable String name) {
        return mappak.stream().filter(mappa -> mappa.getName().equals(name)).collect(Collectors.toList());
    }
}
