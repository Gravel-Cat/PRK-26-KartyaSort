package hu.nye.progkorny.model;

import lombok.Data;

@Data
public class Kartya {
    private final Long id;
    private final String name;
    private final String type;
    private final String rarity;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRarity() {
        return rarity;
    }

    public Kartya(Long id, String name, String type, String rarity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }
}
