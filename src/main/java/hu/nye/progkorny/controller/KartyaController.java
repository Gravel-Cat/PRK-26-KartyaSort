package hu.nye.progkorny.controller;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.service.KartyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kartyak")
public class KartyaController {
    @Autowired
    KartyaService kartyaService;

    @GetMapping
    public List<Kartya> getAllKartya() {
        return kartyaService.getAllKartya();
    }
    @GetMapping("/{id}")
    public Kartya getAllKartya(@PathVariable Long id){
        return kartyaService.getKartyaById(id);
    }

}
