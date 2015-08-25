package exemplocommand;

/**
 * Created by ton on 25/08/15.
 */
public class LightOnCommand implements Icommand {


    private Light ligth;

    public LightOnCommand(Light light) {
        this.ligth = light;
    }

    public void execute() {
        ligth.on();
    }
}
