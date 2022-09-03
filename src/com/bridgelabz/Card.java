package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Card {
    public String[] suits = {"clubs", "Diamonds", "Hearts", "Spades"};
    public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "Queen", "king", "ace"};
    public String[][] arrayOfCard = new String[4][13];
    int numberOfCard = suits.length * ranks.length;
    public String[] deck = new String[numberOfCard];
    public Scanner scanner = new Scanner(System.in);
    public ArrayList listOfPlayer = new ArrayList();


    public void createCard() {
        for (int i = 0; i < numberOfCard; i++) {
            deck[i] = ranks[i % 13] + suits[i / 13];
        }
    }

    public void player() {
        System.out.println("Enter the Number of Player (min = 2 and max = 4)");
        int numberOfPlayer = scanner.nextInt();
        if (numberOfPlayer <= 4 && numberOfPlayer >= 2) {
            for (int i = 0; i < numberOfPlayer; i++) {
                System.out.println("Enter the " + (i + 1) + " player Name");
                String playerName = scanner.next();
                Player player = new Player();
                player.name = playerName;
                listOfPlayer.add(player);
            }
        } else {
            System.err.println("pleases enter the valid number");
            player();
        }
    }
    void displayPlayer(){
        for (int i = 0; i < listOfPlayer.size(); i++) {
            System.out.println(listOfPlayer.get(i));
        }
    }
}
