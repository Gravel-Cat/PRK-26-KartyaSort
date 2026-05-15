package hu.nye.progkorny.model;

import lombok.Data;

@Data
public class Kartya {
    private Long id;
    private String name;
    private String type;
    private String expansion;
    private String rarity;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getExpansion() {
        return expansion;
    }

    public String getRarity() {
        return rarity;
    }

    public Kartya(Long id, String name, String type, String expansion, String rarity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.expansion = expansion;
        this.rarity = rarity;
    }
}
