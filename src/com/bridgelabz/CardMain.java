package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        System.out.println("Welcome to card game");
        Card card = new Card();
        card.createCard();
        card.player();
        card.displayPlayer();
    }
}
