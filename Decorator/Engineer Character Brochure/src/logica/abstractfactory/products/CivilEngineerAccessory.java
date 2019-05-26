package logica.abstractfactory.products;

import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class CivilEngineerAccessory implements Accessory {

    @Override
    public ImageIcon operation() {
        ImageIcon imgBody = new ImageIcon(getClass().getResource("/recursos/images/civilAccessory1.png"));

        return imgBody;
    }

}
