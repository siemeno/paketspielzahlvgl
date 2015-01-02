package paketspielzahlvgl;

public class ZahlVglStarten {

     /**
     * Mit dem Aufruf dieser Klasse wird nun der Ablauf eines 6rundigen Zahlenvergleichspiels gestartet.
     */
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        (new ZahlVglStarten()).run();
     }

     public void run(){
    	 //Zuerst wird eine Instanz der Klasse SpielwerteVergleichen erstellt.
    	 SpielwerteVergleichen SpWertVgl = new SpielwerteVergleichen();

    	 //Nun wird in einer for-Schleife sechsmal die run()-Funktion der Klasse SpielwerteVergleichen()aufgerufen.
    	 for(int i = 1; i <= 6; ++i){
    		 SpWertVgl.run();
    	 }
     System.out.println("Dies ist der Endstand!");
     }
}
