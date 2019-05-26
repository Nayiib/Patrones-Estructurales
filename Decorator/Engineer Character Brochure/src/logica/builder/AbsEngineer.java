package logica.builder;

import java.awt.Component;
import javax.swing.ImageIcon;
import logica.abstractfactory.products.Accessory;
import logica.abstractfactory.products.Tool;
import logica.abstractfactory.products.Vehicle;

/**
 *
 * @author David Bohorquez
 */
public abstract class AbsEngineer {

    protected int posX;
    protected int posY;
    
    protected boolean isAnimado;

    protected Accessory accessory;
    protected Tool tool;
    protected Vehicle vehicle;

    protected ImageIcon[] imgsEngr;

    protected int numImage;

    protected Component lienzo;

    protected ImageIcon bkgdLienzo;

    public AbsEngineer() {
        imgsEngr = new ImageIcon[4];

        numImage = 0;

        bkgdLienzo = new ImageIcon(getClass().getResource("/recursos/images/bkgd1.jpg"));
    }

    public abstract void ingeniar(Component lienzo);

    public ImageIcon getBkgdLienzo() {
        return bkgdLienzo;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public ImageIcon getAccessory() {
        return accessory.operation();
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public ImageIcon getTool() {
        return tool.operation();
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public ImageIcon getVehicle() {
        return vehicle.operation();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ImageIcon[] getImgsEngr() {
        return imgsEngr;
    }

    public void setImgsEngr(ImageIcon[] imgsEngr) {
        this.imgsEngr = imgsEngr;
    }
    
    public void setIsAnimado(boolean isAnimado) {
        this.isAnimado = isAnimado;
    }

}
