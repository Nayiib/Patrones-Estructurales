/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.Adapter;

import GUI.PanelAnimaPersonaje;
import catalogopersonajes.Personajes;
import java.awt.Component;
import logica.builder.AbsEngineer;
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class Adapter extends AbsEngineer {

    private Personajes orco;

    private PanelAnimaPersonaje pnlPersonaje;

    private Game modelo;

    public Adapter(Game modelo) {
        this.modelo = modelo;

        orco = new Personajes("Orco");
    }

    @Override
    public void ingeniar(Component lienzo) {
        pnlPersonaje = new PanelAnimaPersonaje(orco.getPj());
        pnlPersonaje.setBounds(30, 40, 300, 300);
        pnlPersonaje.setVisible(true);
        modelo.getVentanaEng().add(pnlPersonaje);

    }

    public PanelAnimaPersonaje getPnlPersonaje() {
        return pnlPersonaje;
    }

    @Override
    public void run() {

    }

}
