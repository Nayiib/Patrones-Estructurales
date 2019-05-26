package logica.abstractfactory.factories;

import logica.abstractfactory.products.ElectrialEngineerAccessory;
import logica.abstractfactory.products.ElectricalEngineerTool;
import logica.abstractfactory.products.ElectricalEngineerVehicle;
import logica.abstractfactory.products.Tool;
import logica.abstractfactory.products.Vehicle;
import logica.abstractfactory.products.Accessory;

/**
 *
 * @author David Bohorquez
 */
public class ElectricalEngineerFactory implements AbstractFactory {

    @Override
    public Tool createTool() {
        return new ElectricalEngineerTool();
    }

    @Override
    public Accessory createAccessory() {
        return new ElectrialEngineerAccessory();
    }

    @Override
    public Vehicle createVehicle() {
        return new ElectricalEngineerVehicle();
    }

}
