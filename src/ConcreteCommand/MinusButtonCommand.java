package ConcreteCommand;

import Interface.Command;
import Receiver.Light;
import Receiver.MusicPlayer;
import Receiver.Thermostat;

public class MinusButtonCommand implements Command {
    private Light lightBulb;
    private MusicPlayer musicPlayer;
    private Thermostat thermostat;

    public MinusButtonCommand(Light lightBulb)
    {
        this.lightBulb = lightBulb;
    }
    public MinusButtonCommand(MusicPlayer musicPlayer)
    {
        this.musicPlayer = musicPlayer;
    }
    public MinusButtonCommand(Thermostat thermostat)
    {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public String lightBulb() {
        return lightBulb.adjustBrightnessDown();
    }

    @Override
    public String musicPlayer() {
        return musicPlayer.volumeDown();
    }

    @Override
    public String thermostat() {
        return thermostat.tempDown();
    }
}
