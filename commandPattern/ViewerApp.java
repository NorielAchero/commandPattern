package commandPattern;
import java.util.*;

public class ViewerApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Device light = new Light();
        Device airConditioner = new AirConditioner();
        Device musicPlayer = new MusicPlayer();

        CentralHub ch = new CentralHub();

//        Command turnOnLights = new PowerOn(light);
//        ch.addCommand(turnOnLights);
//        ch.clickButton();

        System.out.println("     _______..___  ___.      ___      .______     .___________.        ___      .______   .______   \n" +
                "    /       ||   \\/   |     /   \\     |   _  \\    |           |       /   \\     |   _  \\  |   _  \\  \n" +
                "   |   (----`|  \\  /  |    /  ^  \\    |  |_)  |   `---|  |----`      /  ^  \\    |  |_)  | |  |_)  | \n" +
                "    \\   \\    |  |\\/|  |   /  /_\\  \\   |      /        |  |          /  /_\\  \\   |   ___/  |   ___/  \n" +
                ".----)   |   |  |  |  |  /  _____  \\  |  |\\  \\----.   |  |         /  _____  \\  |  |      |  |      \n" +
                "|_______/    |__|  |__| /__/     \\__\\ | _| `._____|   |__|        /__/     \\__\\ | _|      | _|      \n" +
                "                                                                                                    ");
        System.out.println("\nControl your appliances with a single app!");
        System.out.println("\nAvailable Home Devices: ");
        System.out.println("[1] Lights");
        System.out.println("[2] Air Conditioner");
        System.out.println("[3] Music Player");
        System.out.println("[4] Exit App");

        System.out.print("\nChoose Appliance: ");
        String choice = scan.next();

        switch(choice){
            case "1":
                System.out.println("\nCommands for Lights");
                System.out.println("[1] Switch On" +
                        "\n[2] Switch Off" +
                        "\n[3] Increase Brightness" +
                        "\n[4] Decrease Brightness" +
                        "\n[5] Switch Light Color to left" +
                        "\n[6] Switch Color to Right" +
                        "\n\nChoose Command: ");
                        String devCommand = scan.next();

                        System.out.println();
                        switch (devCommand){
                            case "1":
                                Command lightSwitchOn = new PowerOn(light);
                                ch.addCommand(lightSwitchOn);
                                ch.clickButton();
                                break;
                            case "2":
                                Command lightSwitchOff = new PowerOff(light);
                                ch.addCommand(lightSwitchOff);
                                ch.clickButton();
                                break;
                            case "3":
                                Command LightIncrease = new Increase(light);
                                ch.addCommand(LightIncrease);
                                ch.clickButton();
                                break;
                            case "4":
                                Command LightDecrease = new Decrease(light);
                                ch.addCommand(LightDecrease);
                                ch.clickButton();
                                break;
                            case "5":
                                Command LightLeft = new Left(light);
                                ch.addCommand(LightLeft);
                                ch.clickButton();
                                break;
                            case "6":
                                Command LightRight = new Right(light);
                                ch.addCommand(LightRight);
                                ch.clickButton();
                                break;


                        }


                break;
        }

    }

}