import jeliot.io.*;

public class TV {
    // Attributes ??????
    private boolean active; // this.active
    private int Channel; // this.Channel
    
    // Constructor ????
    
    // Default Constructor ???? ????? ????
    public TV() {
        this.active = false;
        this.Channel = 99; // Default Channle
    }
    
    // Setters & Getters
    public void setChannel( int Channel ) {
        this.Channel = Channel;
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
    
    // Methods
    public void turnOn() {
        this.active = true;
      }
      public void turnOff() {
          this.active = false;
      }
    public void switchActive() {
        if (this.active == false ) {
            this.active = true;
        }
        else {
            this.active = false;
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
        
    }
}