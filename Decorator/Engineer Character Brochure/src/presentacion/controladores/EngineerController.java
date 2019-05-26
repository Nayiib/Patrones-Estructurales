package presentacion.controladores;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import logica.Adapter.Adapter;
import presentacion.modelo.Game;
import presentacion.vistas.EngineerView;

/**
 *
 * @author David Bohorquez
 */
public class EngineerController implements MouseListener {
    
    private EngineerView ventanaEngineer;
    
    public EngineerController(EngineerView ventana) {
        ventanaEngineer = ventana;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Game modelo = ventanaEngineer.getModelo();
        JLabel lblBackground = modelo.getVentanaEngFactory().getLblBackground();
        ImageIcon imgBgEnFactoryWindow = modelo.getVentanaEngFactory().getImgBase();
        
        if (e.getSource().equals(ventanaEngineer.getLblClose())) {
            System.exit(0);
        } else if (e.getSource().equals(ventanaEngineer.getLblBack())) {
            JLabel[] lblsProduct = modelo.getVentanaEngFactory().getLblsProducts();
            MouseListener control = modelo.getVentanaEngFactory().getCtlEnginnerFactoryView();
            
            modelo.getVentanaEngFactory().initStates();
            modelo.changeListenerLblCreate();
            modelo.removAllListeners(lblsProduct, control);
            
            lblBackground.setIcon(imgBgEnFactoryWindow);
            
            if (modelo.isChooseAbsEngr()) {
                modelo.setChooseAbsEngr(false);
                
                modelo.getVentanaEng().remove(((Adapter) (modelo.getOrcoAdapter())).getPnlPersonaje());
            } else {
                modelo.getVentanaEng().getLblEngr().setIcon(null);
                
                modelo.getPreDegreeEngr().setIsAnimado(false);
            }
            
            modelo.getVentanaEng().getLblEngr().setVisible(true);
            modelo.getVentanaEng().getLienzo().setVisible(false);
            
            modelo.getVentanaEngFactory().setVisible(true);
            modelo.getVentanaEng().setVisible(false);
        } else if (e.getSource().equals(ventanaEngineer.getLblIngeniar())) {
            if (modelo.isChooseAbsEngr()) {
                modelo.getVentanaEng().getLienzo().setVisible(false);
                
                modelo.getOrcoAdapter().ingeniar(ventanaEngineer.getLienzo());
            } else {
                modelo.getVentanaEng().getLienzo().setVisible(true);
                modelo.getVentanaEng().getLblEngr().setVisible(false);
                
                modelo.getPreDegreeEngr().ingeniar(ventanaEngineer.getLienzo());
            }
        } else if (e.getSource().equals(ventanaEngineer.getLblBgEngWindow())) {
            if (modelo.isChooseAbsEngr()) {
                
            } else {
                modelo.getPreDegreeEngr().setIsAnimado(false);
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        Game modelo = ventanaEngineer.getModelo();
        JLabel background = ventanaEngineer.getLblBgEngWindow();
        
        if ((e.getSource().equals(ventanaEngineer.getLblClose()))
                || (e.getSource().equals(ventanaEngineer.getLblBack()))
                || (e.getSource().equals(ventanaEngineer.getLblIngeniar()))) {
            
            ventanaEngineer.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        JLabel background = ventanaEngineer.getLblBgEngWindow();
        
        if (e.getSource().equals(ventanaEngineer.getLblClose())
                || e.getSource().equals(ventanaEngineer.getLblBack())
                || (e.getSource().equals(ventanaEngineer.getLblIngeniar()))) {
            ventanaEngineer.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        
    }
    
}
