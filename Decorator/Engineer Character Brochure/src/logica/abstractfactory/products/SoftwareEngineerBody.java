package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineerBody implements Body {

    @Override
    public Image operation() {
        Image imgBody = new ImageIcon(getClass().getResource("").getFile()).getImage();

        return imgBody;
    }

}
