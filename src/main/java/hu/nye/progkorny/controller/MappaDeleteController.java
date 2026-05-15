package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.service.MappaDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mappak/delete")
public class MappaDeleteController {
    @Autowired
    MappaDeleteService mappaDeleteService;

    @GetMapping("/id:{id}")
    public List<Mappa> deleteMappaById(@PathVariable Long id) {
        return mappaDeleteService.deleteMappaById(id);
    }

    @GetMapping("/name:{name}")
    public List<Mappa> deleteMappaByName(@PathVariable String name) {
        return mappaDeleteService.deleteMappaByName(name);
    }
}
