package Client;
import ConcreteCommand.MinusButtonCommand;
import ConcreteCommand.PlusButtonCommand;
import ConcreteCommand.PowerOff;
import ConcreteCommand.PowerOn;
import Receiver.Light;
import Receiver.MusicPlayer;
import Receiver.Thermostat;

import java.util.Scanner;

public class ClientApp
{

    public static void main(String[] args)
    {
        Light lightBulb = new Light();
        MusicPlayer musicPlayer = new MusicPlayer();
        Thermostat thermostat = new Thermostat();

        Scanner in = new Scanner(System.in);

        System.out.println("[1] Light\n[2] Music Player\n[3] Thermostat");
        System.out.println("Which one do you want to set?");
        String input = in.nextLine();

        if(input.equals("1"))
        {
            System.out.println("Set the Light: ");
            System.out.println("[1] Switch On\n[2] Switch Off\n[3] Increase Brightness\n[4] Decrease Brightness");
            String lightInput = in.nextLine();

            if(lightInput.equals("1"))
            {
                PowerOn switchOn = new PowerOn(lightBulb);
                System.out.println(switchOn.lightBulb());
            }
            else if(lightInput.equals("2"))
            {
                PowerOff switchOff = new PowerOff(lightBulb);
                System.out.println(switchOff.lightBulb());
            }
            else if(lightInput.equals("3"))
            {
                PlusButtonCommand adjustBrightnessUp = new PlusButtonCommand(lightBulb);
                System.out.println(adjustBrightnessUp.lightBulb());
            }
            else if(lightInput.equals("4"))
            {
                MinusButtonCommand adjustBrightnessDown = new MinusButtonCommand(lightBulb);
                System.out.println(adjustBrightnessDown.lightBulb());
            }
        }
        else if(input.equals("2"))
        {
            System.out.println("Set the Music Player: ");
            System.out.println("[1] Turn On\n[2] Turn Off\n[3] Increase Volume\n[4] Decrease Volume");
            String musicInput = in.nextLine();

            if(musicInput.equals("1"))
            {
                PowerOn turnOn = new PowerOn(musicPlayer);
                System.out.println(turnOn.musicPlayer());
            }
            else if(musicInput.equals("2"))
            {
                PowerOff turnOff = new PowerOff(musicPlayer);
                System.out.println(turnOff.musicPlayer());
            }
            else if(musicInput.equals("3"))
            {
                PlusButtonCommand volumeUp = new PlusButtonCommand(musicPlayer);
                System.out.println(volumeUp.musicPlayer());
            }
            else if(musicInput.equals("4"))
            {
                MinusButtonCommand volumeDown = new MinusButtonCommand(musicPlayer);
                System.out.println(volumeDown.musicPlayer());
            }
        }
        else if(input.equals("3"))
        {
            System.out.println("Set the Thermostat: ");
            System.out.println("[1] Activate\n[2] Deactivate\n[3] Increase Temperature\n[4] Decrease Temperature");
            String thermostatInput = in.nextLine();

            if(thermostatInput.equals("1"))
            {
                PowerOn activate = new PowerOn(thermostat);
                System.out.println(activate.thermostat());
            }
            else if(thermostatInput.equals("2"))
            {
                PowerOff deactivate = new PowerOff(thermostat);
                System.out.println(deactivate.thermostat());
            }
            else if(thermostatInput.equals("3"))
            {
                PlusButtonCommand tempUp = new PlusButtonCommand(thermostat);
                System.out.println(tempUp.thermostat());
            }
            else if(thermostatInput.equals("4"))
            {
                MinusButtonCommand tempDown = new MinusButtonCommand(thermostat);
                System.out.println(tempDown.thermostat());
            }
        }

        /*

        // light

        PowerOn switchOn = new PowerOn(lightBulb);
        System.out.println(switchOn.lightBulb());

        PowerOff switchOff = new PowerOff(lightBulb);
        System.out.println(switchOff.lightBulb());

        PlusButtonCommand adjustBrightnessUp = new PlusButtonCommand(lightBulb);
        System.out.println(adjustBrightnessUp.lightBulb());

        MinusButtonCommand adjustBrightnessDown = new MinusButtonCommand(lightBulb);
        System.out.println(adjustBrightnessDown.lightBulb());

        // music player

        PowerOn turnOn = new PowerOn(musicPlayer);
        System.out.println(turnOn.musicPlayer());

        PowerOff turnOff = new PowerOff(musicPlayer);
        System.out.println(turnOff.musicPlayer());

        PlusButtonCommand volumeUp = new PlusButtonCommand(musicPlayer);
        System.out.println(volumeUp.musicPlayer());

        MinusButtonCommand volumeDown = new MinusButtonCommand(musicPlayer);
        System.out.println(volumeDown.musicPlayer());

        // thermostat

        PowerOn activate = new PowerOn(thermostat);
        System.out.println(activate.thermostat());

        PowerOff deactivate = new PowerOff(thermostat);
        System.out.println(deactivate.thermostat());

        PlusButtonCommand tempUp = new PlusButtonCommand(thermostat);
        System.out.println(tempUp.thermostat());

        MinusButtonCommand tempDown = new MinusButtonCommand(thermostat);
        System.out.println(tempDown.thermostat());

         */

    }
}
