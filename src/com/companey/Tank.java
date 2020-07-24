package com.companey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tank extends JPanel {
    String pic;
    int size = 10;
    int posX = 300;
    int posY = 280;
    int direction = 0;
    String owner = "player"; // TODO: read about ENUM


    public Tank() {
        setLayout(null);
        repaint();

    }



    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("x=" + posX + ", y=" + posY,40,60);
        ImageIcon i= new ImageIcon("D:\\MEHRZAD\\Programing\\portfolio\\Tanks\\Images\\Tank_top4.png");
        i.paintIcon(this,g,posX,posY);
        g.draw3DRect(10,10,660,540,true);



        }



    public void move() {


    }

    public void shoot() {

    }

    public void destroy() {

    }

}
