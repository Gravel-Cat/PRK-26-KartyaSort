package hu.nye.progkorny.service;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.repository.KiegeszitoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiegeszitoService {
    public List<Kiegeszito> getAllKiegeszito() {
        return KiegeszitoRepository.getAllKiegeszito();
    }

    public Kiegeszito getKiegeszitoById(Long id) {
        return KiegeszitoRepository.getKiegeszitoById(id);
    }

    public List<Kiegeszito> getKiegeszitoByName(String name) {
        return KiegeszitoRepository.getKiegeszitoByName(name);
    }

    public List<Kiegeszito> getKiegeszitoBySize(int size) {
        return KiegeszitoRepository.getKiegeszitoBySize(size);
    }
}
