package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class ElectrialEngineerBody implements Body {

    @Override
    public Image operation() {
        Image imgBody = new ImageIcon(getClass().getResource("")).getImage();

        return imgBody;
    }

}
