package ConcreteCommand;

import Interface.Command;
import Receiver.Light;
import Receiver.MusicPlayer;
import Receiver.Thermostat;

public class PowerOff implements Command
{
    private Light lightBulb;
    private MusicPlayer musicPlayer;
    private Thermostat thermostat;
    public PowerOff(Light lightBulb)
    {
        this.lightBulb = lightBulb;
    }
    public PowerOff(MusicPlayer musicPlayer)
    {
        this.musicPlayer = musicPlayer;
    }
    public PowerOff(Thermostat thermostat)
    {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public String lightBulb() {
        return lightBulb.switchOff();
    }

    @Override
    public String musicPlayer() {
        return musicPlayer.turnOff();
    }

    @Override
    public String thermostat() {
        return thermostat.deactivate();
    }
}
