package exemplocommand;

/**
 * Created by ton on 25/08/15.
 */
public class CommandCLient {


    public static void main(String args[]) {

        ControleRemotoInvoker invoker = new ControleRemotoInvoker();

        Light minhaLuz = new Light();

        invoker.setCommand(new LightOnCommand(minhaLuz));
        invoker.botaoPressionado();

        invoker.setCommand(new LightOffCommand(minhaLuz));

        invoker.botaoPressionado();
    }

}
