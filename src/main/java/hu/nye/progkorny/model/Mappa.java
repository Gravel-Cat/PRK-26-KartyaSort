package hu.nye.progkorny.model;

import java.util.List;

import lombok.Data;

@Data
public class Mappa {
    private final Long id;
    private final String name;
    private final List<Kartya> cards;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Kartya> getCards() {
        return cards;
    }

    public Mappa(Long id, String name, List<Kartya> cards) {
        this.id = id;
        this.name = name;
        this.cards = cards;
    }
}
