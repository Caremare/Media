
package media;


public class Radio {

    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    public double getFmFrequency() {
        return this.fmFrequency; 
    }
    
    public void setFmFrequency(double newFmFrequency) {
        this.fmFrequency = newFmFrequency;
    }
    
    public int getAmFrequency() {
        return this.amFrequency; 
    }
    
    public void setAmFrequency(int newAmFrequency) {
        this.amFrequency = newAmFrequency;
    }
    
    public char getBand() {
        return this.band; 
    }
    
    public void setBand(char newBand) {
        this.band = newBand;
    }
    
    public void showData() {
    System.out.println("Radio FM frequency is: " +getFmFrequency());
    System.out.println("Radio AM frequency is: " +getAmFrequency());
    System.out.println("Radio band is: " +getBand());
    System.out.println("");
    }
    
}
