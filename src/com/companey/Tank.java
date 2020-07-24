package com.companey;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class Tank extends JPanel {
    String pic;
    int size = 10;
    int posX = 300;
    int posY = 280;
    int direction = 0;
    String owner = "player"; // TODO: read about ENUM


    public Tank() {
        System.out.println("zad");
        setLayout(null);
        move();
        repaint();

    }



    public void paint(Graphics g){
        super.paint(g);
        g.drawString("x=" + posX + ", y=" + posY,40,60);
        ImageIcon i= new ImageIcon("D:\\MEHRZAD\\Programing\\portfolio\\Tanks\\Images\\Tank_top4.png");
        i.paintIcon(this,g,posX,posY);
        g.draw3DRect(10,10,660,540,true);
        }



    public void move()   {
        System.out.println("move");
        KeyListener key =new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int KeyCode = e.getKeyCode();
                switch (KeyCode){
                    case KeyEvent.VK_UP:
                    {System.out.println("UP");
                        if(posY>15)
                            posY= posY-10;
                        break;}

                    case KeyEvent.VK_DOWN:
                        if(posY<430)
                            posY= posY+10;
                        break;
                    case KeyEvent.VK_LEFT:
                        if(posX>15)
                            posX=posX-10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(posX<375)
                            posX=posX+10;
                        break;
            }
                repaint();

            }

            @Override
            public void keyReleased (KeyEvent e) {

            }
        };


    }





    public void shoot() {

    }

    public void destroy() {

    }

}
