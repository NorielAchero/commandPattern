package commandPattern;

public class MusicPlayer implements Device{

    @Override
    public void switchOn() {
        System.out.println("[[Music Player switched on!]]");
    }

    @Override
    public void switchOff() {
        System.out.println("[[Music Player switched off!]]");
    }

    @Override
    public void Increase() {
        System.out.println("[[Music Player increased volume!]]");
    }

    @Override
    public void Decrease() {
        System.out.println("[[Music Player decreased volume!]]");
    }

    @Override
    public void Left() {
        System.out.println("[[Music Player switched to Previous Song!]]");
    }

    @Override
    public void Right() {
        System.out.println("[[Music Player switched to Next Song!]");
    }
}
