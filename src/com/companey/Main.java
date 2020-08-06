package com.companey;

import java.util.concurrent.TimeUnit;

public class Main {

   public static void main(String[] args) {
      Display display = new Display();

      // add enemy tanks
      Tank tank1 = new Tank();
      display.addTank(tank1);
      display.repaint();

      try {
         TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }



   }
}
