package ConcreteCommand;

import Interface.Command;
import Receiver.Light;
import Receiver.MusicPlayer;
import Receiver.Thermostat;

public class PlusButtonCommand implements Command
{
    private Light lightBulb;
    private MusicPlayer musicPlayer;
    private Thermostat thermostat;

    public PlusButtonCommand(Light lightBulb)
    {
        this.lightBulb = lightBulb;
    }
    public PlusButtonCommand(MusicPlayer musicPlayer)
    {
        this.musicPlayer = musicPlayer;
    }
    public PlusButtonCommand(Thermostat thermostat)
    {
        this.thermostat = thermostat;
    }


    @Override
    public String execute() {
        return null;
    }

    @Override
    public String lightBulb() {
        return lightBulb.adjustBrightnessUp();
    }

    @Override
    public String musicPlayer() {
        return musicPlayer.volumeUp();
    }

    @Override
    public String thermostat() {
        return thermostat.tempUp();
    }
}
