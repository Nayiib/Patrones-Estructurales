package logica.builder;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author David Bohorquez
 */
public class Engineer extends AbsEngineer implements Runnable {

    private Thread drawThread;

    public Engineer() {
        isAnimado = false;
    }

    @Override
    public void ingeniar(Component lienzo) {
        dobleBuffre = new BufferedImage(lienzo.getWidth(), lienzo.getHeight(), BufferedImage.TYPE_INT_ARGB);
        this.lienzo = lienzo;

        drawThread = new Thread(this);
        isAnimado = true;
        drawThread.start();
    }

    public void dibujar(Component lienzo) {
        if (numImage == 4) {
            numImage = 0;
        }

        Graphics lapiz = dobleBuffre.getGraphics();
        lapiz.drawImage(bkgdLienzo.getImage(), 0, 0, lienzo);

        System.out.println("numImage!!!!!" + numImage);
        lapiz.drawImage(imgsEngr[numImage].getImage(), getPosX(), getPosY(), lienzo);

        Graphics pincel = lienzo.getGraphics();
        pincel.drawImage(dobleBuffre, 0, 0, lienzo);
        numImage++;
    }

    @Override
    public void run() {
        while (isAnimado) {
            dibujar(lienzo);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {

            }
        }
    }

}
