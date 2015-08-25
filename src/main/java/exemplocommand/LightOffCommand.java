package exemplocommand;

/**
 * Created by ton on 25/08/15.
 */
public class LightOffCommand implements Icommand {


    private final Light light;

    public LightOffCommand(Light minhaLuz) {
    this.light = minhaLuz;
    }

    public void execute() {
        this.light.off();
    }
}
