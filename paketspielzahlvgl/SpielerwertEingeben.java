package paketspielzahlvgl;

import java.util.Scanner;

public class SpielerwertEingeben {
     /**
     * Für diese Klasse werden keine Parameter übergeben.
     * Die Klasse dient der Eingabe eines Spielwertes durch den Spieler.
     */
     public static void main(String[] args) {
         (new SpielerwertEingeben()).run();
     }

     public int run() {
          /**
          * In dieser Funktion wird ein ganzahliger Wert von 1 bis 5 zunächst als String eingegeben.
          * Dies geschieht um andere, besonders nicht-ganzzahlige Werte ohne Exception eingeben zu
          * können.
          */
         String stringEingabe = "";
         Scanner in = new Scanner(System.in);

         System.out.println("Bitte geben Sie einen ganzzahligen Wert von 1 bis 5 ein!");

         stringEingabe = in.nextLine();

         /**
          * Solange die Eingabe des Spielers nicht einer ganzen Zahl von 1 bis 5 enspricht, muss sie
          * noch einmal wiederholt werden.
          */
         while (!stringEingabe.equals("1") && !stringEingabe.equals("2")
                 && !stringEingabe.equals("3") && !stringEingabe.equals("4")
                 && !stringEingabe.equals("5")) {
             System.out.println("Sie haben einen unkorrekten Wert eingegeben!");
             System.out.println("Bitte wiederholen Sie die Eingabe eines ganzzahligen "
                                + "Wertes von 1 bis 5!");
             stringEingabe = in.nextLine();
         }


         /**
          * Der nun korrekte Stringwert wird in eine Integerzahl umgewandelt, um einen
          * problemlosen Vergleich mit der computergenerierten Zahl gleichen Typs zu
          * ermöglichen. Die Umwandlung erfolgt hier über die Zwischenstation einer
          * ein Integer-Objekt in den primitiven int-Datentyp.
          */
         Integer integerEingabe = new Integer(stringEingabe);
         int intEingabe = integerEingabe.intValue();

         System.out.println("Sie haben eine " + intEingabe + " eingegeben.");
         return intEingabe;
     }

}
