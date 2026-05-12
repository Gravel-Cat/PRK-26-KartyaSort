package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.service.MappaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mappak")
public class MappaController {
    @Autowired
    MappaService mappaService;

    @GetMapping("/read")
    public List<Mappa> getAllMappa() {
        return mappaService.getAllMappa();
    }

    @GetMapping("/read/id:{id}")
    public Mappa getMappaById(@PathVariable Long id) {
        return mappaService.getMappaById(id);
    }

    @GetMapping("/read/name:{name}")
    public List<Mappa> getMappaByName(@PathVariable String name) {
        return mappaService.getMappaByName(name);
    }
}
