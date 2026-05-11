package hu.nye.progkorny.model;

import java.util.List;

import lombok.Data;

@Data
public class Kiegeszito {
    private final Long id;
    private final String name;
    private final int size;
    private final List<Kartya> cards;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public List<Kartya> getCards() {
        return cards;
    }

    public Kiegeszito(Long id, String name, int size, List<Kartya> cards) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.cards = cards;
    }
}
