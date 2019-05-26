package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineerClothe implements Clothe {

    @Override
    public Image operation() {
        Image imgBody = new ImageIcon(getClass().getResource("")/*.getFile()*/).getImage();

        return imgBody;
    }

}
