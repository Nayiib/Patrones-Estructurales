
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class Launcher {

    private Game myGame;

    public Launcher() {
        myGame = new Game();

        myGame.iniciar();
    }

    public static void main(String[] args) {
        new Launcher();
    }

}
