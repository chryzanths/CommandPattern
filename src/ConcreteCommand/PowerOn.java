package ConcreteCommand;

import Interface.Command;
import Receiver.Light;
import Receiver.MusicPlayer;
import Receiver.Thermostat;

public class PowerOn implements Command
{
    private Light lightBulb;
    private MusicPlayer musicPlayer;
    private Thermostat thermostat;

    public PowerOn(Light lightBulb)
    {
        this.lightBulb = lightBulb;
    }
    public PowerOn(MusicPlayer musicPlayer)
    {
        this.musicPlayer = musicPlayer;
    }
    public PowerOn(Thermostat thermostat)
    {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public String lightBulb() {
        return lightBulb.switchOn();
    }

    @Override
    public String musicPlayer() {
        return musicPlayer.turnOn();
    }

    @Override
    public String thermostat() {
        return thermostat.activate();
    }
}
