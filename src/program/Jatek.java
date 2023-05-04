package program;

import java.util.Random;

public class Jatek {

    private static final Random rnd = new Random();
    
    public void start() {
        System.out.println("Gondoltam egy számra 0..9 között...");
        
        int szam = rnd.nextInt(0, 10);
        
        /*---------------------
         * INNEN MINDENT ciklikusan kell ismételni!
         * a Jatekos ismeretséget csak egyszer kell felvenni
        */
        //System.out.println("a kitalálandó szám: " + szam);
        
        /* Jatek ismeri, azaz referenciát tartalmaz 
           3 Jatekos objektumra
        */
        Jatekos j1 = new Jatekos();
        //j1.tippel();
        Jatekos j2 = new Jatekos();
        //j2.tippel();
        Jatekos j3 = new Jatekos();
        //j3.tippel();
        
        /* Játékos állapot lekérdezése: */
        //int tipp1 = j1.getTipp();
        //System.out.println("1. játékos tippje: " + tipp1);
        //int tipp2 = j2.getTipp();
        //System.out.println("2. játékos tippje: " + tipp2);
        //int tipp3 = j3.getTipp();
        //System.out.println("3. játékos tippje: " + tipp3);
        
        /* tippek ellenõrzése 1 körre, ha van nyertes: */
//        boolean talalt1 = tipp1 == szam;
//        boolean talalt2 = tipp2 == szam;
//        boolean talalt3 = tipp3 == szam;
//        if(talalt1 || talalt2 || talalt3){
//            System.out.println("Van nyertes!");
//        }else{
//            System.out.println("a játékosok újra próbálkoznak...");
//        }
        
        /* tippek ellenõrzése, amíg nincs talalat:  */
        boolean talalat, talalt1, talalt2, talalt3;
        do {
            System.out.println("a kitalálandó szám: " + szam);
            
            j1.tippel();
            j2.tippel();
            j3.tippel();
            
            /* Játékos állapot lekérdezése: */
            int tipp1 = j1.getTipp();
            System.out.println("1. játékos tippje: " + tipp1);
            int tipp2 = j2.getTipp();
            System.out.println("2. játékos tippje: " + tipp2);
            int tipp3 = j3.getTipp();
            System.out.println("3. játékos tippje: " + tipp3);
        
            talalt1 = tipp1 == szam;
            talalt2 = tipp2 == szam;
            talalt3 = tipp3 == szam;
            talalat = talalt1 || talalt2 || talalt3;
            if(!talalat){
                System.out.println("a játékosok újra próbálkoznak...");
            }
        } while (!talalat);
        
        System.out.println("Van nyertes!");
        
        System.out.println("1. jatékos tippje? " + talalt1);
        System.out.println("2. jatékos tippje? " + talalt2);
        System.out.println("3. jatékos tippje? " + talalt3);
        
        System.out.println("Játék vége");
    }
    
}
