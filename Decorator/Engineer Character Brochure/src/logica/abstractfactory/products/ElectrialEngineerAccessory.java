package logica.abstractfactory.products;

import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class ElectrialEngineerAccessory implements Accessory {

    @Override
    public ImageIcon operation() {
        ImageIcon imgBody = new ImageIcon(getClass().getResource("/recursos/images/electAccessory1.png"));

        return imgBody;
    }

}
