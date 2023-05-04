package program;

import java.util.Random;

public class Jatek {

    private static final Random rnd = new Random();
    
    public void start() {
        System.out.println("Gondoltam egy sz�mra 0..9 k�z�tt...");
        
        int szam = rnd.nextInt(0, 10);
        
        /*---------------------
         * INNEN MINDENT ciklikusan kell ism�telni!
         * a Jatekos ismerets�get csak egyszer kell felvenni
        */
        //System.out.println("a kital�land� sz�m: " + szam);
        
        /* Jatek ismeri, azaz referenci�t tartalmaz 
           3 Jatekos objektumra
        */
        Jatekos j1 = new Jatekos();
        //j1.tippel();
        Jatekos j2 = new Jatekos();
        //j2.tippel();
        Jatekos j3 = new Jatekos();
        //j3.tippel();
        
        /* J�t�kos �llapot lek�rdez�se: */
        //int tipp1 = j1.getTipp();
        //System.out.println("1. j�t�kos tippje: " + tipp1);
        //int tipp2 = j2.getTipp();
        //System.out.println("2. j�t�kos tippje: " + tipp2);
        //int tipp3 = j3.getTipp();
        //System.out.println("3. j�t�kos tippje: " + tipp3);
        
        /* tippek ellen�rz�se 1 k�rre, ha van nyertes: */
//        boolean talalt1 = tipp1 == szam;
//        boolean talalt2 = tipp2 == szam;
//        boolean talalt3 = tipp3 == szam;
//        if(talalt1 || talalt2 || talalt3){
//            System.out.println("Van nyertes!");
//        }else{
//            System.out.println("a j�t�kosok �jra pr�b�lkoznak...");
//        }
        
        /* tippek ellen�rz�se, am�g nincs talalat:  */
        boolean talalat, talalt1, talalt2, talalt3;
        do {
            System.out.println("a kital�land� sz�m: " + szam);
            
            j1.tippel();
            j2.tippel();
            j3.tippel();
            
            /* J�t�kos �llapot lek�rdez�se: */
            int tipp1 = j1.getTipp();
            System.out.println("1. j�t�kos tippje: " + tipp1);
            int tipp2 = j2.getTipp();
            System.out.println("2. j�t�kos tippje: " + tipp2);
            int tipp3 = j3.getTipp();
            System.out.println("3. j�t�kos tippje: " + tipp3);
        
            talalt1 = tipp1 == szam;
            talalt2 = tipp2 == szam;
            talalt3 = tipp3 == szam;
            talalat = talalt1 || talalt2 || talalt3;
            if(!talalat){
                System.out.println("a j�t�kosok �jra pr�b�lkoznak...");
            }
        } while (!talalat);
        
        System.out.println("Van nyertes!");
        
        System.out.println("1. jat�kos tippje? " + talalt1);
        System.out.println("2. jat�kos tippje? " + talalt2);
        System.out.println("3. jat�kos tippje? " + talalt3);
        
        System.out.println("J�t�k v�ge");
    }
    
}
