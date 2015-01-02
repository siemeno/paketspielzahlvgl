package paketspielzahlvgl;

import java.util.Random;

public class SpielwertComputerGenerieren {
     /**
     * Der Computer generiert in dieser Klasse mit Hilfe
     * des Zufallsgenerators einen eigenen Spielwert.
     */
     public static void main(String[] args) {
         (new SpielwertComputerGenerieren()).run();
     }

     public int run() {
         Random ra = new Random();
         int zufall = 0;

         zufall = 1 + Math.abs(ra.nextInt() % 5);

         System.out.println("Der Rechner hat eine " + zufall + " ausgewählt!");

         return zufall;
     }

}
