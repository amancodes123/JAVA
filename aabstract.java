abstract  class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

public class aabstract {

    public static void main(String[] args) {
        WagonR obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}