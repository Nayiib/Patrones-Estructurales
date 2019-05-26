package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineerAccessory implements Accessory {

    @Override
    public ImageIcon operation() {
        ImageIcon imgBody = new ImageIcon(getClass().getResource("/recursos/images/softAccessory1.png"));

        return imgBody;
    }

}
