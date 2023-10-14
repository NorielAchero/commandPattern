package commandPattern;

public class Left implements Command{
    private Device device;

    public Left(Device device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Left();
    }
}
