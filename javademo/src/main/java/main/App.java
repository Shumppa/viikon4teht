package main;

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

                switch(valinta){ 
                    case 1:
                        System.out.println("Anna hirviön tyyppi:");
                        String type = sc.nextLine();
                        System.out.println("Anna hirviön elämän määrä numerona:");
                        int health = sc.nextInt();
                        cave.addMonster(new Monster(type, health));
                        break;

                    case 2:
                        cave.listMonsters();
                        break;
                        
                    case 3:
                        
                    case 4:
                        
                    case 5:
                        
                    case 0:
                        System.out.println("Peli päättyy. Kiitos ohjelman käytöstä.");
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

        
    
            
