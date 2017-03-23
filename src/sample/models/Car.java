package sample.models;

/**
 * Created by java-teacher on 3/23/17.
 */
public class Car extends Property {
    private float speed;
    private Privod privod;

    public Car(float price, float weight, String color, String model, float speed, Privod privod) {
        super(price, weight, color, model);
        this.speed = speed;
        this.privod = privod;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Privod getPrivod() {
        return privod;
    }

    public void setPrivod(Privod privod) {
        this.privod = privod;
    }

    @Override
    public void printInfo() {

    }

    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "speed=" + speed +
                ", privod=" + privod +
                '}';
    }

    public enum Privod {
        FRONT,
        BACK
    }
}
