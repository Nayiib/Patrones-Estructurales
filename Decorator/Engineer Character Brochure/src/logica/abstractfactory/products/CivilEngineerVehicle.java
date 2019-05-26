package logica.abstractfactory.products;

import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class CivilEngineerVehicle implements Vehicle {

    @Override
    public ImageIcon operation() {
        ImageIcon imgCivilVehicel = new ImageIcon(getClass().getResource("/recursos/images/civilVehicle1.png"));

        return imgCivilVehicel;
    }

}
