package commandPattern;

public class Increase implements Command{

    private Device device;

    public Increase(Device device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Increase();
    }
}
