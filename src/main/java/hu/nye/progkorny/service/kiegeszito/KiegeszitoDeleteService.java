package hu.nye.progkorny.service.kiegeszito;

import java.util.List;

import hu.nye.progkorny.model.Kiegeszito;
import hu.nye.progkorny.repository.KiegeszitoRepo;
import org.springframework.stereotype.Service;

@Service
public class KiegeszitoDeleteService {
    public List<Kiegeszito> deleteKiegeszitoById(Long id) {
        return KiegeszitoRepo.deleteKiegeszitoById(id);
    }

    public List<Kiegeszito> deleteKiegeszitoByName(String name) {
        return KiegeszitoRepo.deleteKiegeszitoByName(name);
    }

    public List<Kiegeszito> deleteKiegeszitoBySize(int size) {
        return KiegeszitoRepo.deleteKiegeszitoBySize(size);
    }
}
