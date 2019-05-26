package logica.abstractfactory.factories;

import logica.abstractfactory.products.Tool;
import logica.abstractfactory.products.Vehicle;
import logica.abstractfactory.products.Accessory;

/**
 *
 * @author David Bohorquez
 */
public interface AbstractFactory {

    public Tool createTool();

    public Accessory createAccessory();

    public Vehicle createVehicle();
}
