package exemplocommand;

/**
 * Created by ton on 25/08/15.
 */
public class ControleRemotoInvoker {

    Icommand slot;

    public ControleRemotoInvoker() {
    }

    public void setCommand(Icommand command) {
        slot = command;
    }

    public void botaoPressionado() {
        slot.execute();
    }
}
