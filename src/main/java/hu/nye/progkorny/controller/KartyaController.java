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

    @GetMapping("/read")
    public List<Kartya> getAllKartya() {
        return kartyaService.getAllKartya();
    }

    @GetMapping("/read/id:{id}")
    public Kartya getKartyaById(@PathVariable Long id) {
        return kartyaService.getKartyaById(id);
    }

    @GetMapping("/read/name:{name}")
    public List<Kartya> getKartyaByName(@PathVariable String name) {
        return kartyaService.getKartyaByName(name);
    }

    @GetMapping("/read/type:{type}")
    public List<Kartya> getKartyaByType(@PathVariable String type) {
        return kartyaService.getKartyaByType(type);
    }

    @GetMapping("/read/expansion:{expansion}")
    public List<Kartya> getKartyaByExpansion(@PathVariable String expansion) {
        return kartyaService.getKartyaByExpansion(expansion);
    }

    @GetMapping("/read/rarity:{rarity}")
    public List<Kartya> getKartyaByRarity(@PathVariable String rarity) {
        return kartyaService.getKartyaByRarity(rarity);
    }

}
