package commandPattern;

public class Light implements Device{

    @Override
    public void switchOn() {
        System.out.println("[[Light switched on!]]");
    }

    @Override
    public void switchOff() {
        System.out.println("[[Light switched off!]]");
    }

    @Override
    public void Increase() {
        System.out.println("[[Light increased brightness!]]");
    }

    @Override
    public void Decrease() {
        System.out.println("[[Light decreased brightness!]]");
    }

    @Override
    public void Left() {
        System.out.println("[[Light switched color to left!]]");
    }

    @Override
    public void Right() {
        System.out.println("[[Light switched color to right!]]");
    }
}
