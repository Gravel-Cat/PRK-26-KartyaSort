package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.service.KiegeszitoReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kiegeszitok")
public class KiegeszitoReadController {
    @Autowired
    KiegeszitoReadService kiegeszitoReadService;

    @GetMapping("/read")
    public List<Kiegeszito> getAllKiegeszito() {
        return kiegeszitoReadService.getAllKiegeszito();
    }

    @GetMapping("/read/id:{id}")
    public Kiegeszito getKiegeszitoById(@PathVariable Long id) {
        return kiegeszitoReadService.getKiegeszitoById(id);
    }

    @GetMapping("/read/name:{name}")
    public List<Kiegeszito> getKiegeszitoByName(@PathVariable String name) {
        return kiegeszitoReadService.getKiegeszitoByName(name);
    }

    @GetMapping("/read/size:{size}")
    public List<Kiegeszito> getKiegeszitoBySize(@PathVariable int size) {
        return kiegeszitoReadService.getKiegeszitoBySize(size);
    }
}
