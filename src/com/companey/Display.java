package com.companey;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Display extends JFrame {

    Tank tank;

    public Display()
    {
        setupFrame();
    }

    public void setupFrame(){
        this.setBounds(10,30,800,630);
        this.setTitle("Tanks");
        this.setBackground(Color.gray);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public void paint(Graphics g)
    {
        System.out.println("here");
        super.paint(g);
        g.drawString("x=" + tank.playerPosX + ", y=" + tank.playerPosY,40,60);
        ImageIcon i= new ImageIcon(tank.PTank);
        i.paintIcon(this,g,tank.playerPosX,tank.playerPosY);
        ImageIcon j= new ImageIcon(tank.Etank);
        j.paintIcon(this,g,tank.enemyPosX,tank.enemyPosY);
        g.draw3DRect(20,50,750,550,true);
    }

    public void generateMap()
    {

    }

    public void addTank(Tank newTank) {
        this.tank = newTank;
    }
}
