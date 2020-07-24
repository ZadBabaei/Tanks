package com.companey;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OldTank extends Frame implements KeyListener {
    int x=255,y=255;
    public OldTank(){
        setSize(500,500);
        addKeyListener( this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
    public void paint(Graphics g){
        g.drawString("x=" + x + ", y=" + y,40,60);
        ImageIcon i= new ImageIcon("D:\\MEHRZAD\\Programing\\portfolio\\Tanks\\Images\\Tank_top4.png");
        i.paintIcon(this,g,x,y);
        g.draw3DRect(25,35,450,450,true);
//        g.setColor(Color.red);
//        g.fill3DRect(x,y,40,40,true);

    }


    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {
        int KeyCode=e.getKeyCode();

        switch (KeyCode){
            case KeyEvent.VK_UP:
                if(y>15)
                    y= y-10;
                break;

            case KeyEvent.VK_DOWN:
                if(y<430)
                    y= y+10;
                break;
            case KeyEvent.VK_LEFT:
                if(x>15)
                    x=x-10;
                break;
            case KeyEvent.VK_RIGHT:
                if(x<375)
                x=x+10;
                break;
        }
        repaint();

    }


    public void keyReleased(KeyEvent e) {

    }

}
