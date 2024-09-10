package inter;

public class Air implements Remote {

    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is turned off");

    }
}
