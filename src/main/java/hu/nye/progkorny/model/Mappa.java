package hu.nye.progkorny.model;

import java.util.List;

import lombok.Data;

@Data
public class Mappa {
    private Long id;
    private String name;
    private List<Kartya> cards;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCards(List<Kartya> cards) {
        this.cards = cards;
    }

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
