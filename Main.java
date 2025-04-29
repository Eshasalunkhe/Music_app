interface Playable {
    void play();
}

abstract class Instrument implements Playable {
    void tune() {
        System.out.println("Instrument is being tuned.");
    }

    abstract void repair();
}

final class Guitar extends Instrument {
    public void play() {
        System.out.println("Guitar is playing music.");
    }


    void repair() {
        System.out.println("Repairing the Guitar.");
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();  
        guitar.tune();                 
        guitar.play();                 
        guitar.repair();               
    }
}
