package hu.nye.progkorny.service;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.repository.KiegeszitoRepo;
import org.springframework.stereotype.Service;

@Service
public class KiegeszitoCreateService {
    public List<Kiegeszito> createKiegeszito(Long id, String name, int size) {
        return KiegeszitoRepo.createKiegeszito(id, name, size);
    }
}
