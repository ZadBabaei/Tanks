package com.companey;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class Tank {
    private int size = 10;
    public int playerPosX = 400;
    public int playerPosY = 300;
    public int enemyPosX =150;
    public int enemyPosY = 150;
    public int direction = 0;
    private String owner = "player"; // TODO: read about ENUM
    public KeyListener listener;
    public String PTank = "D:\\MEHRZAD\\Programing\\portfolio\\Tanks\\Images\\player1_tank_up.png";
    public String Etank="D:\\MEHRZAD\\Programing\\portfolio\\Tanks\\Images\\enemy_tank_up.png";


    public Tank() {
        System.out.println("zad");
        listener = new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                move(e);
            }

            @Override
            public void keyReleased (KeyEvent e) {

            }
        };

    }


//
//    public void paint(Graphics g){
////        super.paint(g);
//        g.drawString("x=" + posX + ", y=" + posY,40,60);
//        ImageIcon i= new ImageIcon("D:\\MEHRZAD\\Programing\\portfolio\\Tanks\\Images\\Tank_top4.png");
//        i.paintIcon(this,g,posX,posY);
//        g.draw3DRect(10,10,660,540,true);
//        }
//
//

    public void move(KeyEvent e)   {
        System.out.println("move");

        int KeyCode = e.getKeyCode();
        switch (KeyCode){
            case KeyEvent.VK_UP:
            {System.out.println("UP");
                if(playerPosY>15)
                    playerPosY= playerPosY-10;
                break;}

            case KeyEvent.VK_DOWN:
                if(playerPosY<430)
                    playerPosY= playerPosY+10;
                break;
            case KeyEvent.VK_LEFT:
                if(playerPosX>15)
                    playerPosX=playerPosX-10;
                break;
            case KeyEvent.VK_RIGHT:
                if(playerPosX<375)
                    playerPosX=playerPosX+10;
                break;
        }

    }





    public void shoot() {

    }

    public void destroy() {

    }

}
