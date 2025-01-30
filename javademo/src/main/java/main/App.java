package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä pelaajan nimi: ");
        String playerName = sc.nextLine();
        Player player = new Player(playerName);
        Cave cave = new Cave(player);


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää luolaan hirviö");
            System.out.println("2) Listaa hirviöt");
            System.out.println("3) Hyökkää hirviöön");
            System.out.println("4) Tallenna peli");
            System.out.println("5) Lataa peli");
            System.out.println("0) Lopeta peli");
            int valinta = sc.nextInt();
            sc.nextLine();

                switch(valinta){ 
                    case 1:
                        System.out.println("Anna hirviön tyyppi:");
                        String type = sc.nextLine();
                        System.out.println("Anna hirviön elämän määrä numerona:");
                        int health = sc.nextInt();
                        cave.addMonster(new Monster(type, health));
                        break;

                    case 2:
                        if (cave.monsters.isEmpty()) {
                            System.out.println("Luola on tyhjä.");
                        } else
                        System.out.println("Luolan hirviöt: ");
                        cave.listMonsters();
                        break;
                        
                    case 3:
                        System.out.println("Valitse hirviö, johon hyökätä: ");
                        cave.listMonsters();
                        int monsterIndex = sc.nextInt();
                        sc.nextLine();
                        Monster monster = cave.monsters.get(monsterIndex - 1);
                        player.attack(monster);
                        if (monster.health <= 0) {
                            cave.removeMonster(monster);
                        }
                        break;

                    case 4:
                        System.out.println("Anna tiedoston nimi, johon peli tallentaa: ");
                        String filename = sc.nextLine();
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
                            oos.writeObject(cave);
                            System.out.println("Peli tallennettiin tiedostoon " + filename + ".");
                        } catch (IOException e) {
                            System.out.println("Tallennus epäonnistui: " + e.getMessage());
                        }
                        break;

                    case 5:
                        System.out.println("Anna tiedoston nimi, josta peli ladataan: ");
                        String filename2 = sc.nextLine();
                        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename2))) {
                            cave = (Cave) ois.readObject();
                            player = cave.player;
                            System.out.println("Peli ladattu tiedostosta " + filename2 + ". Tervetuloa takaisin, " + player.name + ".");
                        } catch (IOException | ClassNotFoundException e) {
                            System.out.println("Lataus epäonnistui: " + e.getMessage());
                        }
                        break;   

                    case 0:
                        System.out.println("Peli päättyy. Kiitos pelaamisesta!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }
        sc.close();
        }
    }

        
    
            
