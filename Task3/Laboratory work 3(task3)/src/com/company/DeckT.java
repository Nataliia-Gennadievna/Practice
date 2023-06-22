//Автор: Удинська Наталія

package com.company;

public class DeckT {
        public static void main(String[] args) {

            Deck deck = new Deck();

            System.out.println("----------new deck:-----------");
            for (int i = 0; i < 36; i++) {
                System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
            }

            deck.shuffle();

            System.out.println("--------shuffled deck:--------------");
            for (int i = 0; i < 36; i++) {
                System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
            }

            deck.order();

            System.out.println("--------ordered deck:--------------");
            for (int i = 0; i < 36; i++) {
                System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
            }

            System.out.println("--------lastCard:--------------");
            while (deck.hasNext()) {
                Card lastCard = deck.drawOne();
                System.out.println(lastCard.getSuit().getName() + " " + lastCard.getRank().getName());
            }
        }
    }
