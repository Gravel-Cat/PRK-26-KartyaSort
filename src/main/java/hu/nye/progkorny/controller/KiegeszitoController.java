package hu.nye.progkorny.controller;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.service.KiegeszitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kiegeszitok")
public class KiegeszitoController {
    @Autowired
    KiegeszitoService kiegeszitoService;

    @GetMapping
    public List<Kiegeszito> getAllKiegeszito() {
        return kiegeszitoService.getAllKiegeszito();
    }

    @GetMapping("/id:{id}")
    public Kiegeszito getKiegeszitoById(@PathVariable Long id) {
        return kiegeszitoService.getKiegeszitoById(id);
    }

    @GetMapping("/name:{name}")
    public List<Kiegeszito> getKiegeszitoByName(@PathVariable String name) {
        return kiegeszitoService.getKiegeszitoByName(name);
    }

    @GetMapping("/size:{size}")
    public List<Kiegeszito> getKiegeszitoBySize(@PathVariable int size) {
        return kiegeszitoService.getKiegeszitoBySize(size);
    }
}
