package main;

import java.io.Serializable;

public class Player implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;

    public Player(String name){
        this.name = name;
    }

    public void attack(Monster target, Cave cave){
        if (target.health > 10){
            target.health -= 10;
            System.out.println(this.name + " hyökkää " + target.name + " hirviöön!");
            System.out.println("Hirviöllä on " + target.health + " elämää jäljellä.");
        } else {
            System.out.println(this.name + " hyökkää " + target.name + " hirviöön!");
            System.out.println( this.name + " kuoli!");
            cave.removeMonster(target);
        }
        }
}
