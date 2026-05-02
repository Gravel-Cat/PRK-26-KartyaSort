package hu.nye.progkorny.repository;

import hu.nye.progkorny.model.Kartya;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public class KartyaRepository {
    public List<Kartya> getAllKartya() {
        Kartya kartya1 = new Kartya(1L, "kártya1");
        Kartya kartya2 = new Kartya(2L, "kártya2");
        return List.of(kartya1, kartya2);
    }
    public Kartya getKartyaById(@PathVariable Long id) {
        Kartya kartya1 = new Kartya(1L, "kártya1");
        Kartya kartya2 = new Kartya(2L, "kártya2");
        List<Kartya> kartyak = List.of(kartya1, kartya2);

        return kartyak.stream().filter(kartya -> kartya.getId().equals(id)).findFirst().get();
    }
}
