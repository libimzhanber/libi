# libi
libi-mzhanber 191011
import jeliot.io.*;

public class TV {
    // Constants 
    final int DEFAULT_CHANNEL = 50;
    final int DEFAULT_VOLUME = 16;
    final int MIN_CHANNEL = 1;
    final  int MAX_CHANNEL = 100;
    final int MIN_VOLUME = 0;
    final int MAX_VOLUME = 100;
    
    // Attributes ??????
    private boolean active; // this.active
    private int Channel; // this.Channel
    private int volume; // 0-100
    
    // Constructor ????
    
    // Default Constructor ???? ????? ????
    public TV() {
        this.setActive  (false);
        this.setChannel  (DEFAULT_CHANNEL) ; // Default Channle
        this.setVolume (DEFAULT_VOLUME) ; // Default volume 
    } // TV
    
    public TV (int defaultChannel) {
    this(); // Activate the deafult constructor
    this.setChannel(deafultChannel);
    }
    
    public TV (int defaultChannel , int defaultVolume) {
        this (defaultChannel );// Activate constructor with channel
        this.setVolume (defalutVolume);
    }
    
    //copy constractor
    public TV ( TV other ) {
                this.setActive (other.getActive() );
                this.setChannel (other.getChannel() );
                this.setVolume (other.getVolume() );
                }
    
    // Setters & Getters
    public void setChannel( int Channel ) {
    if (Channel >= MIN_CHANNEL && Channel <= MAX_CHANNEL) {
        this.Channel = Channel;
    }
    }
    public int getChannel() {
        return this.Channel;
    }
    public void setActive( boolean active) {
        this.active = active;
    }
    public boolean getActive() {
        return this.active;
    }
    public void setVolume (int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME)
            this.volume=volume;
            }
            
    public int getVolume() {
    return this.volume;
    }
    
    // Methods
    public void turnOn() {
        this.setActive (true);
      }
      public void turnOff() {
          this.setActive (false);
      }
    public void switchActive() {
        if (this.getActive ()== false ) {
            this.setActive (true);
        }
        else {
            this.setActive (false);
        }
    }
} // TV

public class MyClass {

    public static void main() {
        TV tv1 = new TV();
        TV tv2 = new TV();
        boolean statusTV1;
        boolean statusTV2;


        tv1.turnOn();
        tv2.turnOn();
       tv1.setChannel( 50 );
        tv2.setChannel( 70 );
        tv1.turnOff();
        tv2.switchActive();
        statusTV2 = tv2.getActive();
        tv2.switchActive();
        statusTV2 = tv2.getActive();
        int Channel2 = tv2.getChannel();
        TV tv3 = new TV (tv2);
        
    }
}
