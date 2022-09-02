package com.bridgelabz;

public class Card {
    public String[] suits = {"clubs","Diamonds","Hearts","Spades"};
    public String[] ranks = {"2","3","4","5","6","7","8","9","10","jack","Queen","king","ace"};
    public String[][] arrayOfCard = new String[4][13];
    int numberOfCard = suits.length * ranks.length;
    public String[] deck = new String[numberOfCard];


    public void deck(){
        for (int i = 0; i < numberOfCard; i++) {
            int random = i +(int)(Math.random()*(numberOfCard-i));
            String temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }
    }
}
