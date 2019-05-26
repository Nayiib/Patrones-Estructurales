package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class IndustrialEngineerWeapon implements Weapon {

    @Override
    public Image operation() {
        Image imgWeapon = new ImageIcon(getClass().getResource("")).getImage();

        return imgWeapon;
    }
}
