/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.decorator;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import logica.abstractfactory.products.CivilEngineerAccessory;
import logica.abstractfactory.products.ElectrialEngineerAccessory;
import logica.abstractfactory.products.SoftwareEngineerAccessory;
import logica.builder.AbsEngineer;

/**
 *
 * @author David Bohorquez
 */
public class CertificateEngineer extends Decorator {

    private Thread drawThread;

    private ImageIcon[] imgsCertEngr;

    public CertificateEngineer(AbsEngineer engineer) {
        super(engineer);

        imgsCertEngr = new ImageIcon[4];
        System.out.println("----" + engineer.getAccessory().getClass());
        if (engineer.getAccessory().getClass().equals(SoftwareEngineerAccessory.class)) {
            System.out.println("SOFTWARE");
            imgsCertEngr[0] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 1.1.png"));
            imgsCertEngr[1] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 2.1.png"));
            imgsCertEngr[2] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 3.1.png"));
            imgsCertEngr[3] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing sistemas 4.1.png"));
        } else if (engineer.getAccessory().getClass().equals(ElectrialEngineerAccessory.class)) {
            System.out.println("Electrical");
            imgsCertEngr[0] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 1.1.png"));
            imgsCertEngr[1] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 2.1.png"));
            imgsCertEngr[2] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 3.1.png"));
            imgsCertEngr[3] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing electric 4.1.png"));
        } else if (engineer.getAccessory().getClass().equals(CivilEngineerAccessory.class)) {
            System.out.println("Civil");
            imgsCertEngr[0] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 1.1.png"));
            imgsCertEngr[1] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 2.1.png"));
            imgsCertEngr[2] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 3.1.png"));
            imgsCertEngr[3] = new ImageIcon(getClass().getResource("/recursos/images/animacion ing civil 4.1.png"));
        }

    }

    @Override
    public void ingeniar(Component lienzo) {
        //engineer.ingeniar(lienzo);
        engineer.setIsAnimado(false);

        dobleBuffre = new BufferedImage(lienzo.getWidth(), lienzo.getHeight(), BufferedImage.TYPE_INT_ARGB);
        this.lienzo = lienzo;

        drawThread = new Thread(this);
        isAnimado = true;
        drawThread.start();
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

    public void dibujar(Component lienzo) {
        if (numImage == 4) {
            numImage = 0;
        }

        Graphics lapiz = dobleBuffre.getGraphics();
        lapiz.drawImage(bkgdLienzo.getImage(), 0, 0, lienzo);

        System.out.println("numImageCERT!!!!!" + numImage);
        lapiz.drawImage(imgsCertEngr[numImage].getImage(), getPosX(), getPosY(), lienzo);

        Graphics pincel = lienzo.getGraphics();
        pincel.drawImage(dobleBuffre, 0, 0, lienzo);
        numImage++;
    }

}
