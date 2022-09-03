package com.bridgelabz;

public class CardMain {
    public static void main(String[] args) {
        System.out.println("Welcome to card game");
        Card card = new Card();
        card.createCard();
        card.player();
        card.playerSequence();
        card.deckShuffle();
    }
}
