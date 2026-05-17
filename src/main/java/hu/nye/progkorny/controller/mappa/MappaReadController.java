package hu.nye.progkorny.controller.mappa;

import java.util.List;

import hu.nye.progkorny.model.Mappa;
import hu.nye.progkorny.service.mappa.MappaReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mappak/read")
public class MappaReadController {
    @Autowired
    MappaReadService mappaReadService;

    @GetMapping()
    public List<Mappa> getAllMappa() {
        return mappaReadService.getAllMappa();
    }

    @GetMapping("/id:{id}")
    public Mappa getMappaById(@PathVariable Long id) {
        return mappaReadService.getMappaById(id);
    }

    @GetMapping("/name:{name}")
    public List<Mappa> getMappaByName(@PathVariable String name) {
        return mappaReadService.getMappaByName(name);
    }
}
