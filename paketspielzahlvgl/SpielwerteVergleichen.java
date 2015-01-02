package paketspielzahlvgl;

public class SpielwerteVergleichen {

     //Die beiden folgenden Variablen werden als Klassenvariablen definiert, da sie andernfalls bei einem mehrrundigen
     //Spiel in jeder Runde erneut initialisiert würden und somit nichthochgezählt werden könnten, um einen Spielstand
     //auszugeben.
	 int rechnerpunkte = 0;
	 int spielerpunkte = 0;

     /**
     * @param args
     */
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        (new SpielwerteVergleichen()).run();
     }

     
     public void run(){
         //Der in einer eigenen Klasse eingegebene Spielerwert wird übernommen.
    	 SpielerwertEingeben Spielereingabe = new SpielerwertEingeben();
    	 int spielerwert = Spielereingabe.run();

    	 //Der in einer eigenen Klasse eingegebene Computerwert wird übernommen.
    	 SpielwertComputerGenerieren Computereingabe = new SpielwertComputerGenerieren();
    	 int computerwert = Computereingabe.run();


    	 
    	 switch (spielerwert){
           // Der Spieler wählt seine Zahl ohne Kenntnis der Auswahl des Rechners.
	       // Sind beide Zahlen gleich wird kein Punkt vergeben.
            case 1: if(computerwert==1) {System.out.println("Der Spielstand bleibt gleich!");
                                         break;}
                    //Ansonsten macht entweder der Rechner ...
                    if(computerwert==2 || computerwert==3) {System.out.println("Der Rechner punktet!");
                                               ++rechnerpunkte;
                                               break;}
                    // ... oder der Spieler einen Punkt mit gleicher Wahrscheinlichkeit.
                    if(computerwert==4 || computerwert==5) {System.out.println("Der Spieler punktet!");
                                               ++spielerpunkte;
                                               break;}
            case 2: if(computerwert==2) {System.out.println("Der Spielstand bleibt gleich!");
                                         break;}
                    if(computerwert==3 || computerwert==4) {System.out.println("Der Rechner punktet!");
                                               ++rechnerpunkte;
                                               break;}
                    if(computerwert==1 || computerwert==5) {System.out.println("Der Spieler punktet");
                                               ++spielerpunkte;
                                               break;}
            case 3: if(computerwert==3) {System.out.println("Der Spielstand bleibt gleich!");
                                         break;}
                    if(computerwert==4 || computerwert==5) {System.out.println("Der Rechner punktet!");
                                               ++rechnerpunkte;
                                               break;}
                    if(computerwert==1 || computerwert==2) {System.out.println("Der Spieler punktet");
                                               ++spielerpunkte;
                                               break;}
            case 4: if(computerwert==4) {System.out.println("Der Spielstand bleibt gleich!");
                                         break;}
                    if(computerwert==5 || computerwert==1) {System.out.println("Der Rechner punktet!");
                                               ++rechnerpunkte;
                                               break;}
                    if(computerwert==2 || computerwert==3) {System.out.println("Der Spieler punktet");
                                               ++spielerpunkte;
                                               break;}
            case 5: if(computerwert==5) {System.out.println("Der Spielstand bleibt gleich!");
                                               break;}
                    if(computerwert==1 || computerwert==2) {System.out.println("Der Rechner punktet!");
                                               ++rechnerpunkte;
                                               break;}
                    if(computerwert==3 || computerwert==4) {System.out.println("Der Spieler punktet");
                                               ++spielerpunkte;
                                               break;}
            }

	  // Der Zwischenstand wird nach jeder Runde ausgegeben.
	  System.out.println("Stand => Spieler: " + spielerpunkte + " / Rechner: " + rechnerpunkte);
	}

}

