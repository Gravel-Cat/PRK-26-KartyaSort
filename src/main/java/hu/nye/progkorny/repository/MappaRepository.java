package hu.nye.progkorny.repository;

import hu.nye.progkorny.model.Mappa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MappaRepository {
    static Mappa mappa1 = new Mappa(1L, "Főmappa", List.of(KartyaRepository.kartya1,KartyaRepository.kartya2,KartyaRepository.kartya3,KartyaRepository.kartya4,KartyaRepository.kartya5,KartyaRepository.kartya6));
    static Mappa mappa2 = new Mappa(2L, "Mellékmappa", List.of(KartyaRepository.kartya7,KartyaRepository.kartya8,KartyaRepository.kartya9,KartyaRepository.kartya10));
    static List<Mappa> mappak = List.of(mappa1,mappa2);

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
