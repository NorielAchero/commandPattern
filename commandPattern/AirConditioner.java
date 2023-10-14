package commandPattern;

public class AirConditioner implements Device{

    @Override
    public void switchOn() {
        System.out.println("[[Air Conditioner switched on!]]");
    }

    @Override
    public void switchOff() {
        System.out.println("[[Air Conditioner switched off!]]");
    }

    @Override
    public void Increase() {
        System.out.println("[[ir Conditioner increased temperature!]]");
    }

    @Override
    public void Decrease() {
        System.out.println("[[Air Conditioner decreased temperature!]]");
    }

    @Override
    public void Left() {
        System.out.println("[[Air Conditioner panned shade to left]]");
    }

    @Override
    public void Right() {
        System.out.println("[[Air Conditioner panned shade to right]]");
    }
}
