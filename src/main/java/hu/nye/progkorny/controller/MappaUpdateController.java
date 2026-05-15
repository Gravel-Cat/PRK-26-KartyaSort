package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.service.MappaUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mappak/update")
public class MappaUpdateController {
    @Autowired
    MappaUpdateService mappaUpdateService;

    @GetMapping("/id:{id},field:{field},data:{data}")
    public List<Mappa> updateMappa(@PathVariable Long id, @PathVariable String field, @PathVariable String data) {
        return mappaUpdateService.updateMappa(id, field, data);
    }
}
