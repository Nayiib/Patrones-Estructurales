package logica.builder;

import javax.swing.ImageIcon;
import logica.abstractfactory.factories.CivilEngineerFactory;
import logica.abstractfactory.factories.ElectricalEngineerFactory;
import logica.abstractfactory.factories.SoftwareEngineerFactory;
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class PreDegreeEngineer extends EngineerConstructor {

    private Game modelo;

    public PreDegreeEngineer(Game modelo) {
        this.modelo = modelo;

        factory = modelo.getFactory();
    }

    @Override
    public void buildEnginner() {
        engineer = new Engineer();

        if (factory instanceof SoftwareEngineerFactory) {
            engineer.getImgsEngr()[0] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 1.png"));
            engineer.getImgsEngr()[1] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 2.png"));
            engineer.getImgsEngr()[2] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 3.png"));
            engineer.getImgsEngr()[3] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 4.png"));
        } else if (factory instanceof ElectricalEngineerFactory) {
            engineer.getImgsEngr()[0] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 1.png"));
            engineer.getImgsEngr()[1] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 2.png"));
            engineer.getImgsEngr()[2] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 3.png"));
            engineer.getImgsEngr()[3] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 4.png"));
        } else if (factory instanceof CivilEngineerFactory) {
            engineer.getImgsEngr()[0] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 1.png"));
            engineer.getImgsEngr()[1] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 2.png"));
            engineer.getImgsEngr()[2] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 3.png"));
            engineer.getImgsEngr()[3] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 4.png"));
        }
    }

    @Override
    public void buildAccessory() {
        engineer.setAccessory(factory.createAccessory());
    }

    @Override
    public void buildTool() {
        engineer.setTool(factory.createTool());
    }

    @Override
    public void buildVehicle() {
        engineer.setVehicle(factory.createVehicle());
    }

}
