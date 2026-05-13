package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.service.KartyaDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kartyak/delete")
public class KartyaDeleteController {
    @Autowired
    KartyaDeleteService kartyaDeleteService;

    @GetMapping("/id:{id}")
    public List<Kartya> deleteKartyaById(@PathVariable Long id) {
        return kartyaDeleteService.deleteKartyaById(id);
    }

    @GetMapping("/name:{name}")
    public List<Kartya> deleteKartyaByName(@PathVariable String name) {
        return kartyaDeleteService.deleteKartyaByName(name);
    }

    @GetMapping("/type:{type}")
    public List<Kartya> deleteKartyaByType(@PathVariable String type) {
        return kartyaDeleteService.deleteKartyaByType(type);
    }

    @GetMapping("/expansion:{expansion}")
    public List<Kartya> deleteKartyaByExpansion(@PathVariable String expansion) {
        return kartyaDeleteService.deleteKartyaByExpansion(expansion);
    }

    @GetMapping("/rarity:{rarity}")
    public List<Kartya> deleteKartyaByRarity(@PathVariable String rarity) {
        return kartyaDeleteService.deleteKartyaByRarity(rarity);
    }
}
