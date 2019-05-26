package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class IndustrialEngineerBody implements Body {

    @Override
    public Image operation() {
        Image imgBody = new ImageIcon(getClass().getResource("")).getImage();

        return imgBody;
    }

}
