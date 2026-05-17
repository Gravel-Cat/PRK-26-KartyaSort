package hu.nye.progkorny.controller.kiegeszito;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.service.kiegeszito.KiegeszitoUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kiegeszitok/update")
public class KiegeszitoUpdateController {
    @Autowired
    KiegeszitoUpdateService kiegeszitoUpdateService;

    @GetMapping("/id:{id},field:{field},data:{data}")
    public List<Kiegeszito> updateKiegeszito(@PathVariable Long id, @PathVariable String field, @PathVariable String data) {
        return kiegeszitoUpdateService.updateKiegeszito(id, field, data);
    }

    @GetMapping("/kartyaid:{kartyaId},kiegeszitoid:{kiegeszitoId}")
    public List<Kiegeszito> addKartyaToKiegeszito(@PathVariable Long kartyaId, @PathVariable Long kiegeszitoId) {
        return kiegeszitoUpdateService.addKartyaToKiegeszito(kartyaId, kiegeszitoId);
    }
}
