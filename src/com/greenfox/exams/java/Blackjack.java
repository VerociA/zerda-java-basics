package com.greenfox.exams.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Verőci Ádám on 2016.12.05..
 */
public class Blackjack {
    private JFrame mainFrame;
    private JLabel playerLabel;
    private JLabel houseLabel;
    private JPanel controlPanel;
    private JButton newGame;
    private JButton drawCard;


    public Blackjack(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Blackjack game");
        mainFrame.setSize(600,400);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        playerLabel = new JLabel("", JLabel.CENTER);
        houseLabel = new JLabel("",JLabel.CENTER);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(playerLabel);
        mainFrame.add(houseLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(newGame);
        mainFrame.add(drawCard);
    }


    private void Buttons(){

        playerLabel.setText("User played");
        houseLabel.setText("House played");

        JButton newGame = new JButton("New Game");
        JButton drawCard = new JButton("Draw a drawCard");

        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                blackjack.start();
            }
        });

        drawCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deck.draw();
            }
        });

        controlPanel.add(newGame);
        controlPanel.add(drawCard);
    }
}
}
