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
        System.out.println("Luolan hirviöt: ");
        for (int i = 0; i < this.monsters.size(); i++){
                        monsters.get(i).printInfo(i + 1);
                    }
                }
            }