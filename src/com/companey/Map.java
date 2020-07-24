package com.companey;

import javax.swing.*;
import java.awt.*;
import java.util.PrimitiveIterator;


public class Map    {
    private static final int WIDTH =700;
    private static final int HEIGHT =600;
    public Map(){

    }






    public void  draw() {
        JFrame frame=new JFrame("Map");
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new Tank());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void generateGrid() {


    }



}

