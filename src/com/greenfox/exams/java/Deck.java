package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.05..
 */
public class Deck {
  ArrayList<Card> cards;
  ArrayList<Card> used;

  public Deck() {
  cards = new ArrayList<Card>();
  used = new ArrayList<Card>();
  }

  public void draw(colorValue){
      cards.remove(colorValue);
      used.add(colorValue);
  }
}
