package com.gingermadfire.javaeelearning.entities;

public class NamedBaseEntity extends BaseEntity {

    private String name;

    public NamedBaseEntity(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
