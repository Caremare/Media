
package main;

import media.Radio;
import media.Television;

public class Main {

    
    public static void main(String[] args) {
        
        Television Rts = new Television();
        Rts.setCurrentProgram(1);
        Rts.setTurnOn(true);
        Rts.setVolume(4);
        Rts.showData();
        
        Radio Bum = new Radio();
        Bum.setFmFrequency(87.6);
        Bum.setAmFrequency(400);
        Bum.setBand('F');
        Bum.showData();
    }
    
}
