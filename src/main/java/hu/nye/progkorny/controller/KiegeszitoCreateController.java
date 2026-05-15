package hu.nye.progkorny.controller;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.service.KiegeszitoCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kiegeszitok/create")
public class KiegeszitoCreateController {
    @Autowired
    KiegeszitoCreateService kiegeszitoCreateService;

    @GetMapping("/id:{id},name:{name},size:{size}")
    public List<Kiegeszito> createKiegeszito(@PathVariable Long id, @PathVariable String name, @PathVariable int size) {
        return kiegeszitoCreateService.createKiegeszito(id, name, size);
    }
}
