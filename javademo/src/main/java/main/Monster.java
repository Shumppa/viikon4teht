package main;

import java.io.Serializable;

public class Monster implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    int health;

    public Monster(String name, int health){
        this.name = name;
        this.health = health;
    }


}
