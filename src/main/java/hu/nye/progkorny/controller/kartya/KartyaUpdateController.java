package hu.nye.progkorny.controller.kartya;

import java.util.List;

import hu.nye.progkorny.model.Kartya;
import hu.nye.progkorny.service.kartya.KartyaUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kartyak/update")
public class KartyaUpdateController {
    @Autowired
    KartyaUpdateService kartyaUpdateService;

    @GetMapping("/id:{id},field:{field},data:{data}")
    public List<Kartya> updateKartya(@PathVariable Long id, @PathVariable String field, @PathVariable String data) {
        return kartyaUpdateService.updateKartya(id, field, data);
    }
}
