package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Cave implements Serializable{
    private static final long serialVersionUID = 1L;
    Player player;
    ArrayList<Monster> monsters;

    public Cave(Player player){
        this.player = player;
        this.monsters = new ArrayList<Monster>();
    }

    public void addMonster(Monster monster){
        this.monsters.add(monster);
    }

    public void removeMonster(Monster monster){
        this.monsters.remove(monster);
    }

    public void listMonsters(){
        for (Monster monster : monsters){
            System.out.println(monster.name + " / " + monster.health);
        }
    }

    
}