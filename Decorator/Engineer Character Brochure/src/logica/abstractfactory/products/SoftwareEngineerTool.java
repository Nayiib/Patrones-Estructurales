package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineerTool implements Tool {

    @Override
    public ImageIcon operation() {
        ImageIcon imgTool = new ImageIcon(getClass().getResource("/recursos/images/softTool1.png"));

        return imgTool;
    }

}
