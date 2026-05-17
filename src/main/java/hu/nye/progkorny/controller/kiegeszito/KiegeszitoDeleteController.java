package hu.nye.progkorny.controller.kiegeszito;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.service.kiegeszito.KiegeszitoDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kiegeszitok/delete")
public class KiegeszitoDeleteController {
    @Autowired
    KiegeszitoDeleteService kiegeszitoDeleteService;

    @GetMapping("/id:{id}")
    public List<Kiegeszito> deleteKiegeszitoById(@PathVariable Long id) {
        return kiegeszitoDeleteService.deleteKiegeszitoById(id);
    }

    @GetMapping("/name:{name}")
    public List<Kiegeszito> deleteKiegeszitoByName(@PathVariable String name) {
        return kiegeszitoDeleteService.deleteKiegeszitoByName(name);
    }

    @GetMapping("/size:{size}")
    public List<Kiegeszito> deleteKiegeszitoBySize(@PathVariable int size) {
        return kiegeszitoDeleteService.deleteKiegeszitoBySize(size);
    }
}
