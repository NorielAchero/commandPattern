package commandPattern;
import java.util.*;

public class ViewerApp {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Device light = new Light();
        Device airConditioner = new AirConditioner();
        Device musicPlayer = new MusicPlayer();

        CentralHub ch = new CentralHub();


        System.out.println("     _______..___  ___.      ___      .______     .___________.        ___      .______   .______   \n" +
                "    /       ||   \\/   |     /   \\     |   _  \\    |           |       /   \\     |   _  \\  |   _  \\  \n" +
                "   |   (----`|  \\  /  |    /  ^  \\    |  |_)  |   `---|  |----`      /  ^  \\    |  |_)  | |  |_)  | \n" +
                "    \\   \\    |  |\\/|  |   /  /_\\  \\   |      /        |  |          /  /_\\  \\   |   ___/  |   ___/  \n" +
                ".----)   |   |  |  |  |  /  _____  \\  |  |\\  \\----.   |  |         /  _____  \\  |  |      |  |      \n" +
                "|_______/    |__|  |__| /__/     \\__\\ | _| `._____|   |__|        /__/     \\__\\ | _|      | _|      \n" +
                "                                                                                                    ");

        while(true) {
            System.out.println("\nControl your appliances with a single app!");
            System.out.println("\nAvailable Home Devices: ");
            System.out.println("[1] Lights");
            System.out.println("[2] Air Conditioner");
            System.out.println("[3] Music Player");
            System.out.println("[4] Exit App");

            System.out.print("\nChoose Appliance: ");
            String choice = scan.nextLine();



            if (choice.equals("1")) {
                while (true) {

                    System.out.println("\nCommands for Lights");
                    System.out.print("\n[1] Switch On" +
                            "\n[2] Switch Off" +
                            "\n[3] Increase Brightness" +
                            "\n[4] Decrease Brightness" +
                            "\n[5] Switch Light Color to left" +
                            "\n[6] Switch Color to Right" +
                            "\n[7] Exit Light Commands" +
                            "\n\nChoose Command: ");

                    String devCommand = scan.nextLine();

                    if (devCommand.equals("7")) {
                        System.out.println("Exiting Lights...");
                        break;
                    }
                    System.out.println();
                    cmd(devCommand, light, ch);

                    System.out.println();
                }
            } else if (choice.equals("2")) {

                while (true) {
                    System.out.println("\nCommands for Air Conditioner");
                    System.out.print("\n[1] Switch On" +
                            "\n[2] Switch Off" +
                            "\n[3] Increase Temp" +
                            "\n[4] Decrease Temp" +
                            "\n[5] Pan Shade to Left" +
                            "\n[6] Pan Shade to Right" +
                            "\n[7] Exit Air Conditioner Commands" +
                            "\n\nChoose Command: ");
                    String devCommand2 = scan.nextLine();

                    if (devCommand2.equals("7")) {
                        System.out.println("Exiting Air Conditioner...");
                        break;
                    }
                    System.out.println();
                    cmd(devCommand2, airConditioner, ch);

                    System.out.println();
                }
            } else if (choice.equals("3")) {

                while (true) {
                    System.out.println("\nCommands for Music Player");
                    System.out.print("\n[1] Switch On" +
                            "\n[2] Switch Off" +
                            "\n[3] Increase Volume" +
                            "\n[4] Decrease Volume" +
                            "\n[5] Previous Song" +
                            "\n[6] Next Song" +
                            "\n[7] Exit Music Player Commands" +
                            "\n\nChoose Command: ");

                    String devCommand3 = scan.nextLine();

                    if (devCommand3.equals("7")) {
                        System.out.println("Exiting Music Player...");
                        break;
                    }
                    System.out.println();
                    cmd(devCommand3, musicPlayer, ch);

                    System.out.println();
                }
            } else if (choice.equals("4")) {
                System.out.println("\nThank you for using Smart App!" +
                        "\nExiting Application...");
                System.exit(0);
                break;
            } else {
                System.out.println("\nInvalid Input. Select choice again");
            }


        }


    }

    public static void cmd(String devCommand, Device device, CentralHub ch){


        switch (devCommand){
            case "1":
                Command powerOnCmd = new PowerOn(device);
                ch.addCommand(powerOnCmd );
                ch.clickButton();
                break;
            case "2":
                Command powerOffCmd = new PowerOff(device);
                ch.addCommand(powerOffCmd);
                ch.clickButton();
                break;
            case "3":
                Command increaseCmd = new Increase(device);
                ch.addCommand(increaseCmd);
                ch.clickButton();
                break;
            case "4":
                Command decreaseCmd = new Decrease(device);
                ch.addCommand(decreaseCmd);
                ch.clickButton();
                break;
            case "5":
                Command leftCmd = new Left(device);
                ch.addCommand(leftCmd);
                ch.clickButton();
                break;
            case "6":
                Command rightCmd = new Right(device);
                ch.addCommand(rightCmd);
                ch.clickButton();
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }

    }

}