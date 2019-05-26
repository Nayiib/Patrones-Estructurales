/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.abstractfactory.products;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author David Bohorquez
 */
public class SoftwareEngineerVehicle implements Vehicle{

    @Override
    public ImageIcon operation() {
        ImageIcon imgSoftVehicle = new ImageIcon(getClass().getResource("/recursos/images/softVehicle1.png"));
        
        return imgSoftVehicle;
    }
    
}
