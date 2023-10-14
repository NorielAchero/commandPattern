package commandPattern;

public class Decrease implements Command{

    private Device device;

    public Decrease(Device device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Decrease();
    }
}
