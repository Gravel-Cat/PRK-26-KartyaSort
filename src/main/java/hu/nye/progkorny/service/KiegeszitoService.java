package hu.nye.progkorny.service;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.repository.KiegeszitoRepo;
import org.springframework.stereotype.Service;

@Service
public class KiegeszitoService {
    public List<Kiegeszito> getAllKiegeszito() {
        return KiegeszitoRepo.getAllKiegeszito();
    }

    public Kiegeszito getKiegeszitoById(Long id) {
        return KiegeszitoRepo.getKiegeszitoById(id);
    }

    public List<Kiegeszito> getKiegeszitoByName(String name) {
        return KiegeszitoRepo.getKiegeszitoByName(name);
    }

    public List<Kiegeszito> getKiegeszitoBySize(int size) {
        return KiegeszitoRepo.getKiegeszitoBySize(size);
    }
}
