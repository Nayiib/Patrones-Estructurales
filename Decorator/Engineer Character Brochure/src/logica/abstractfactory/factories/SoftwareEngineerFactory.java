package logica.abstractfactory.factories;

import logica.abstractfactory.products.SoftwareEngineerAccessory;
import logica.abstractfactory.products.SoftwareEngineerTool;
import logica.abstractfactory.products.SoftwareEngineerVehicle;
import logica.abstractfactory.products.Tool;
import logica.abstractfactory.products.Vehicle;
import logica.abstractfactory.products.Accessory;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineerFactory implements AbstractFactory {

    @Override
    public Tool createTool() {
        return new SoftwareEngineerTool();
    }

    @Override
    public Accessory createAccessory() {
        return new SoftwareEngineerAccessory();
    }

    @Override
    public Vehicle createVehicle() {
        return new SoftwareEngineerVehicle();
    }

}
