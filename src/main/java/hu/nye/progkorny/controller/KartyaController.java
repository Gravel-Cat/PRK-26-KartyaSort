package hu.nye.progkorny.controller;

import hu.nye.progkorny.model.Kartya;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kartyak")
public class KartyaController {
    @GetMapping
    public List<Kartya> getAllKartya() {
        Kartya kartya1 = new Kartya(1L, "kártya1");
        Kartya kartya2 = new Kartya(2L, "kártya2");
        return List.of(kartya1, kartya2);
    }
    @GetMapping("/{id}")
    public Kartya getAllKartya(@PathVariable Long id) {
        Kartya kartya1 = new Kartya(1L, "kártya1");
        Kartya kartya2 = new Kartya(2L, "kártya2");
        List<Kartya> kartyak = List.of(kartya1, kartya2);

        return kartyak.stream().filter(kartya -> kartya.getId().equals(id)).findFirst().get();
    }
}
