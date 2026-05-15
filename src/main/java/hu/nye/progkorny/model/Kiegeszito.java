package hu.nye.progkorny.model;

import java.util.List;

import lombok.Data;

@Data
public class Kiegeszito {
    private Long id;
    private String name;
    private int size;
    private List<Kartya> cards;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
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
