
package media;


public class Television {
    
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn;
    
    public int getVolume() {
        return this.volume; 
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram; 
    }
    
    public void setCurrentProgram(int newCurrentProgram) {
        this.currentProgram = newCurrentProgram;
    }
    
    public boolean getTurnOn() {
        return this.turnOn; 
    }
   
    public void setTurnOn(boolean newTurnOn) {
        this.turnOn = newTurnOn;
    }
    
    public void showData() {
        System.out.println("Current TV programme is: " +getCurrentProgram());
        System.out.println("TV is turned on(true -ON, false -OFF): " +getTurnOn());
        System.out.println("Current TV volume is: " +getVolume());
        System.out.println("");
    }
    
    
    
    
}
