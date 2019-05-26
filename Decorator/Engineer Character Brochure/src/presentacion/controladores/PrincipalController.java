package presentacion.controladores;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import presentacion.modelo.Game;
import presentacion.vistas.PrincipalView;

/**
 *
 * @author David Bohorquez
 */
public class PrincipalController implements MouseListener, MouseMotionListener {

    private PrincipalView ventanaPrincipal;

    public PrincipalController(PrincipalView ventana) {
        ventanaPrincipal = ventana;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Game modelo = ventanaPrincipal.getMyGame();
        PrincipalView ventana = ventanaPrincipal;
        if (e.getSource().equals(ventana.getLblClose())) {
            System.exit(0);
        } else if (e.getSource().equals(ventana.getLblPlay())) {
            modelo.getVentanaEngFactory().setVisible(true);
            modelo.getVentanaPrincipal().setVisible(false);
        }
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        PrincipalView ventana = ventanaPrincipal;
        if (e.getSource().equals(ventana.getLblClose()) || e.getSource().equals(ventana.getLblPlay())) {
            getVentanaPrincipal().setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        PrincipalView ventana = ventanaPrincipal;
        if (e.getSource().equals(ventana.getLblClose()) || e.getSource().equals(ventana.getLblPlay())) {
            getVentanaPrincipal().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public PrincipalView getVentanaPrincipal() {
        return ventanaPrincipal;
    }

}
