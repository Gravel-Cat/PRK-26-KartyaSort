package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.service.MappaCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mappak/create")
public class MappaCreateController {
    @Autowired
    MappaCreateService mappaCreateService;

    @GetMapping("/id:{id},name:{name}")
    public List<Mappa> createMappa(@PathVariable Long id, @PathVariable String name) {
        return mappaCreateService.createMappa(id, name);
    }
}
