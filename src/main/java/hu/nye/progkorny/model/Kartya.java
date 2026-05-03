package hu.nye.progkorny.model;

import lombok.Data;

@Data
public class Kartya {
    private final Long id;
    private final String name;
    private final String expansion;
    private final String type;
    private final String rarity;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExpansion() {
        return expansion;
    }

    public String getType() {
        return type;
    }

    public String getRarity() {
        return rarity;
    }

    public Kartya(Long id, String name, String expansion, String type, String rarity) {
        this.id = id;
        this.name = name;
        this.expansion = expansion;
        this.type = type;
        this.rarity = rarity;
    }
}
