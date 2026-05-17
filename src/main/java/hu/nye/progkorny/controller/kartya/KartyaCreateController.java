package hu.nye.progkorny.controller.kartya;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.service.kartya.KartyaCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kartyak/create")
public class KartyaCreateController {
    @Autowired
    KartyaCreateService kartyaCreateService;

    @GetMapping("/id:{id},name:{name},type:{type},expansion:{expansion},rarity:{rarity}")
    public List<Kartya> createKartya(@PathVariable Long id, @PathVariable String name, @PathVariable String type, @PathVariable String expansion, @PathVariable String rarity) {
        return kartyaCreateService.createKartya(id, name, type, expansion, rarity);
    }
}
