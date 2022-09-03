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
    public ArrayList<Player> listOfPlayer = new ArrayList();
    public ArrayList<Player> sequencesOfPlayer = new ArrayList();
    int numberOfPlayer;


    public void createCard() {
        for (int i = 0; i < numberOfCard; i++) {
            deck[i] = ranks[i % 13] + suits[i / 13];
        }
    }

    public void player() {
        System.out.println("Enter the Number of Player (min = 2 and max = 4)");
        numberOfPlayer = scanner.nextInt();
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
        displayPlayer();
    }

    public void displayPlayer() {
        for (Object player : listOfPlayer) {
            System.out.println(player);
        }
    }

    public void playerSequence() {
        for (int j = 0; j < numberOfPlayer ; j++) {
            boolean condition1 = true;
            while (condition1) {
                System.out.println("Enter the name of player to play "+(j+1));
                String name = scanner.next();
                for (int i = 0; i < listOfPlayer.size(); i++) {
                    if (listOfPlayer.get(i).getName().equals(name)) {
                        sequencesOfPlayer.add(listOfPlayer.get(i));
                        condition1 = false;
                    }
                }
            }
        }
        displaySequencesPlayer();
    }
    public void displaySequencesPlayer() {
        System.out.println("Sequences of player is : ");
        for (Object player : listOfPlayer) {
            System.out.println(player);
        }
    }
    public void deckShuffle(){
        for (int i = 0; i < numberOfCard; i++) {
            int random = i +(int)(Math.random()*(numberOfCard-i));
            String temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }
    }
}
