package hu.nye.progkorny.controller.kiegeszito;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.service.kiegeszito.KiegeszitoReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kiegeszitok/read")
public class KiegeszitoReadController {
    @Autowired
    KiegeszitoReadService kiegeszitoReadService;

    @GetMapping()
    public List<Kiegeszito> getAllKiegeszito() {
        return kiegeszitoReadService.getAllKiegeszito();
    }

    @GetMapping("/id:{id}")
    public Kiegeszito getKiegeszitoById(@PathVariable Long id) {
        return kiegeszitoReadService.getKiegeszitoById(id);
    }

    @GetMapping("/name:{name}")
    public List<Kiegeszito> getKiegeszitoByName(@PathVariable String name) {
        return kiegeszitoReadService.getKiegeszitoByName(name);
    }

    @GetMapping("/size:{size}")
    public List<Kiegeszito> getKiegeszitoBySize(@PathVariable int size) {
        return kiegeszitoReadService.getKiegeszitoBySize(size);
    }
}
