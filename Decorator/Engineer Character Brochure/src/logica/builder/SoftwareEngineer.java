package logica.builder;

import logica.abstractfactory.factories.SoftwareEngineerFactory;
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineer extends EngineerConstructor {

    private Game modelo;
    private SoftwareEngineerFactory factory;

    public SoftwareEngineer(Game modelo) {
        this.modelo = modelo;
        factory = (SoftwareEngineerFactory) modelo.getFactory();
    }

    @Override
    public void buildEnginner() {
        engineer = new Engineer();
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
