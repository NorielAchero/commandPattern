package commandPattern;

public class Right implements Command{
    private Device device;

    public Right(Device device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Right();
    }
}
