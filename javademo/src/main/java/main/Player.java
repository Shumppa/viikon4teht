package main;

import java.io.Serializable;

public class Player implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;

    public Player(String name){
        this.name = name;
    }

    public void attack(Monster target, Cave cave){
        if (target.takeDamage(10)) {
            System.out.println(name + " hyökkää " + target.name + " hirviöön!");
            System.out.println("Hirviöllä on " + target.health + " elämää jäljellä.");
        } else {
            System.out.println(name + " hyökkää " + target.name + " hirviöön!");
            System.out.println(target.name + " on kuollut!");
            cave.removeMonster(target);
        }
    }
}
