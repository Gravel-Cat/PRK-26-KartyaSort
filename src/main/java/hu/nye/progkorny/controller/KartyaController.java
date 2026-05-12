package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.service.KartyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kartyak")
public class KartyaController {
    @Autowired
    KartyaService kartyaService;

    @GetMapping
    public List<Kartya> getAllKartya() {
        return kartyaService.getAllKartya();
    }

    @GetMapping("/id:{id}")
    public Kartya getKartyaById(@PathVariable Long id) {
        return kartyaService.getKartyaById(id);
    }

    @GetMapping("/expansion:{expansion}")
    public List<Kartya> getKartyaByExpansion(@PathVariable String expansion) {
        return kartyaService.getKartyaByExpansion(expansion);
    }

}
