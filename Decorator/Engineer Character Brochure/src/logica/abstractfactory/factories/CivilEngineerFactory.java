package logica.abstractfactory.factories;

import logica.abstractfactory.products.CivilEngineerAccessory;
import logica.abstractfactory.products.CivilEngineerTool;
import logica.abstractfactory.products.CivilEngineerVehicle;
import logica.abstractfactory.products.Tool;
import logica.abstractfactory.products.Vehicle;
import logica.abstractfactory.products.Accessory;

/**
 *
 * @author David Bohorquez
 */
public class CivilEngineerFactory implements AbstractFactory {

    @Override
    public Tool createTool() {
        return new CivilEngineerTool();
    }

    @Override
    public Accessory createAccessory() {
        return new CivilEngineerAccessory();
    }

    @Override
    public Vehicle createVehicle() {
        return new CivilEngineerVehicle();
    }
}
