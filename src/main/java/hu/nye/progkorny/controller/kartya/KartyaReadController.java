package hu.nye.progkorny.controller.kartya;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.service.kartya.KartyaReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kartyak/read")
public class KartyaReadController {
    @Autowired
    KartyaReadService kartyaReadService;

    @GetMapping()
    public List<Kartya> getAllKartya() {
        return kartyaReadService.getAllKartya();
    }

    @GetMapping("/id:{id}")
    public Kartya getKartyaById(@PathVariable Long id) {
        return kartyaReadService.getKartyaById(id);
    }

    @GetMapping("/name:{name}")
    public List<Kartya> getKartyaByName(@PathVariable String name) {
        return kartyaReadService.getKartyaByName(name);
    }

    @GetMapping("/type:{type}")
    public List<Kartya> getKartyaByType(@PathVariable String type) {
        return kartyaReadService.getKartyaByType(type);
    }

    @GetMapping("/expansion:{expansion}")
    public List<Kartya> getKartyaByExpansion(@PathVariable String expansion) {
        return kartyaReadService.getKartyaByExpansion(expansion);
    }

    @GetMapping("/rarity:{rarity}")
    public List<Kartya> getKartyaByRarity(@PathVariable String rarity) {
        return kartyaReadService.getKartyaByRarity(rarity);
    }
}
