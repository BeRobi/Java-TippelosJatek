package program;

import java.util.Random;

public class Jatekos {
    
    private static final Random rnd = new Random();
    private int tipp;
    
    public void tippel(){
        int tipp = rnd.nextInt(0, 10);
        this.tipp = tipp;
        //System.out.println("tippel�sem: " + this.tipp);
    }
    
    public int getTipp(){
        return tipp;//m�g besz�desebb: this.tipp;
    }
}
