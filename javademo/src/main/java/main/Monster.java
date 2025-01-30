package main;

import java.io.Serializable;

public class Monster implements Serializable{
    private static final long serialVersionUID = 1L;
    String type;
    int health;

    public Monster(String name, int health){
        this.type = name;
        this.health = health;
    }

    public void printInfo(int number){
        System.out.println(number + ": " + this.type + " / " + this.health + "HP");
    }

    public Boolean takeDamage(int damage){
        this.health -= damage;
        return health > 0;
    }

    public String type() {
        return type;
    }

    public int health() {
        return health;
    }

}
