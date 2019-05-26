package logica.abstractfactory.products;

import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class ElectricalEngineerVehicle implements Vehicle {

    @Override
    public ImageIcon operation() {
        ImageIcon imgElectVehicle = new ImageIcon(getClass().getResource("/recursos/images/electVehicle1.png"));

        return imgElectVehicle;
    }

}
