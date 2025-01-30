package main;

import java.io.Serializable;

public class Player implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;

    public Player(String name){
        this.name = name;
    }

    public void attack(Monster target) {
        System.out.println(name + " hyökkää " + target.type() + " hirviöön!");
        if (!target.takeDamage(10)) {
            System.out.println("Hirviö kuoli!");
        } else {
            System.out.println("Hirviöllä on " + target.health() + " elämää jäljellä.");
        }
    }
}
