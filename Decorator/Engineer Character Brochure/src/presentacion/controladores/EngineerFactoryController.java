package presentacion.controladores;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import presentacion.modelo.Game;
import presentacion.vistas.EngineerFactoryView;

/**
 *
 * @author David Bohorquez
 */
public class EngineerFactoryController implements MouseListener {
    
    private EngineerFactoryView ventanaEngFactory;
    
    public EngineerFactoryController(EngineerFactoryView ventana) {
        ventanaEngFactory = ventana;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Game modelo = ventanaEngFactory.getModelo();
        JLabel background = ventanaEngFactory.getLblBackground();
        boolean[] states = ventanaEngFactory.getImgStates();
        
        if (e.getSource().equals(ventanaEngFactory.getLblClose())) {
            System.exit(0);
        } else if (e.getSource().equals(ventanaEngFactory.getLblBack())) {
            ventanaEngFactory.initStates();
            
            modelo.removAllListeners(ventanaEngFactory.getLblsProducts(), this);
            
            background.setIcon(ventanaEngFactory.getImgBase());
            
            modelo.getVentanaPrincipal().setVisible(true);
            ventanaEngFactory.setVisible(false);
        }
        
        if (e.getSource().equals(ventanaEngFactory.getLblSoftware())) {
            if (modelo.check(states) != 0) {
                modelo.selectEngineer(0);
                
                modelo.chooseFactory(modelo.check(states));
                modelo.showEngrParts();
                
                modelo.onListeners(ventanaEngFactory.getLblsProducts(), this);
                
                modelo.changeListenerLblCreate();
                
                background.setIcon(ventanaEngFactory.getImgSoftCreate());
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblElectrical())) {
            if (modelo.check(states) != 1) {
                modelo.selectEngineer(1);
                
                modelo.chooseFactory(modelo.check(states));
                modelo.showEngrParts();
                
                modelo.onListeners(ventanaEngFactory.getLblsProducts(), this);
                
                modelo.changeListenerLblCreate();
                
                background.setIcon(ventanaEngFactory.getImgElectCreate());
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblCivil())) {
            if (modelo.check(states) != 2) {
                modelo.selectEngineer(2);
                
                modelo.chooseFactory(modelo.check(states));
                modelo.showEngrParts();
                
                modelo.onListeners(ventanaEngFactory.getLblsProducts(), this);
                
                modelo.changeListenerLblCreate();
                
                background.setIcon(ventanaEngFactory.getImgCivilCreate());
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblOrco())) {
            modelo.getOrcoAdapter();
            
            modelo.setChooseAbsEngr(true);
            
            modelo.getVentanaEng().setVisible(true);
            modelo.getVentanaEngFactory().setVisible(false);
            
        } else if (e.getSource().equals(ventanaEngFactory.getLblBackground())) {
            ventanaEngFactory.initStates();
            modelo.changeListenerLblCreate();
            
            System.out.println("OFF LISTENERS PRODUCTS!!!");
            modelo.removAllListeners(ventanaEngFactory.getLblsProducts(), this);
            
            background.setIcon(ventanaEngFactory.getImgBase());
            
        } else if (e.getSource().equals(ventanaEngFactory.getLblCreate())) {
            System.out.println("FACTORY:------" + modelo.check(states));
            modelo.chooseFactory(modelo.check(states));
            
            modelo.buildEngineer();
            
            modelo.showEngineer();
            
            modelo.getVentanaEng().setVisible(true);
            modelo.getVentanaEngFactory().setVisible(false);
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
        Game modelo = ventanaEngFactory.getModelo();
        JLabel background = ventanaEngFactory.getLblBackground();
        boolean[] states = ventanaEngFactory.getImgStates();
        
        if ((e.getSource().equals(ventanaEngFactory.getLblClose()))
                || (e.getSource().equals(ventanaEngFactory.getLblBack()))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[0]))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[1]))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[2]))) {
            
            ventanaEngFactory.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        
        if (e.getSource().equals(ventanaEngFactory.getLblSoftware())) {
            if (modelo.check(states) != 0) {
                ventanaEngFactory.setCursor(new Cursor(Cursor.HAND_CURSOR));
                
                if (modelo.check(states) == -1) {
                    background.setIcon(ventanaEngFactory.getImgSoftware());
                    
                } else if (modelo.check(states) == 1) {
                    background.setIcon(ventanaEngFactory.getImgElectSoft());
                } else if (modelo.check(states) == 2) {
                    background.setIcon(ventanaEngFactory.getImgCivilSoft());
                }
            } else {
                ventanaEngFactory.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            
        } else if (e.getSource().equals(ventanaEngFactory.getLblElectrical())) {
            if (modelo.check(states) != 1) {
                ventanaEngFactory.setCursor(new Cursor(Cursor.HAND_CURSOR));
                
                if (modelo.check(states) == -1) {
                    background.setIcon(ventanaEngFactory.getImgElectrical());
                    
                } else if (modelo.check(states) == 0) {
                    background.setIcon(ventanaEngFactory.getImgSoftElect());
                } else if (modelo.check(states) == 2) {
                    background.setIcon(ventanaEngFactory.getImgCivilElect());
                }
            } else {
                ventanaEngFactory.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblCivil())) {
            if (modelo.check(states) != 2) {
                ventanaEngFactory.setCursor(new Cursor(Cursor.HAND_CURSOR));
                
                if (modelo.check(states) == -1) {
                    background.setIcon(ventanaEngFactory.getImgCivil());
                    
                } else if (modelo.check(states) == 0) {
                    background.setIcon(ventanaEngFactory.getImgSoftCivil());
                } else if (modelo.check(states) == 1) {
                    background.setIcon(ventanaEngFactory.getImgElectCivil());
                }
            } else {
                ventanaEngFactory.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblOrco())) {
            ventanaEngFactory.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
        } else if (e.getSource().equals(ventanaEngFactory.getLblCreate())) {
            if (modelo.check(states) != -1) {
                ventanaEngFactory.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblsProducts()[0])) {
            if (modelo.check(states) == 0) {
                System.out.println("GLASES!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgSoftAccessory());
            } else if (modelo.check(states) == 1) {
                System.out.println("GORRA!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgElectAccessory());
            } else if (modelo.check(states) == 2) {
                System.out.println("HELMT!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgCivilAccessory());
            }
            ventanaEngFactory.getLblEngrProduct().setIcon(modelo.getAccessory().operation());
            
        } else if (e.getSource().equals(ventanaEngFactory.getLblsProducts()[1])) {
            if (modelo.check(states) == 0) {
                System.out.println("LAPTOP!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgSoftTool());
                //ventanaEngFactory.getLblEngrProduct().setIcon(modelo.getTool().operation());
            } else if (modelo.check(states) == 1) {
                System.out.println("MULTI!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgElectTool());
            } else if (modelo.check(states) == 2) {
                System.out.println("PAPER!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgCivilTool());
            }
            ventanaEngFactory.getLblEngrProduct().setIcon(modelo.getTool().operation());
            
        } else if (e.getSource().equals(ventanaEngFactory.getLblsProducts()[2])) {
            if (modelo.check(states) == 0) {
                System.out.println("FERRARI!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgSoftVehicle());
            } else if (modelo.check(states) == 1) {
                System.out.println("MOTORBIKE!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgElectVehicle());
            } else if (modelo.check(states) == 2) {
                System.out.println("BUS!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgCivilVehicle());
            }
            ventanaEngFactory.getLblEngrProduct().setIcon(modelo.getVehicle().operation());
        }
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        Game modelo = ventanaEngFactory.getModelo();
        JLabel background = ventanaEngFactory.getLblBackground();
        boolean[] states = ventanaEngFactory.getImgStates();
        
        if ((e.getSource().equals(ventanaEngFactory.getLblClose()))
                || (e.getSource().equals(ventanaEngFactory.getLblBack())) || (e.getSource().equals(ventanaEngFactory.getLblSoftware()))
                || (e.getSource().equals(ventanaEngFactory.getLblElectrical()))
                || (e.getSource().equals(ventanaEngFactory.getLblCivil()))
                || (e.getSource().equals(ventanaEngFactory.getLblCreate()))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[0]))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[1]))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[2]))
                || (e.getSource().equals(ventanaEngFactory.getLblOrco()))) {
            
            ventanaEngFactory.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        
        if (e.getSource().equals(ventanaEngFactory.getLblSoftware())) {
            if (modelo.check(states) != 0) {
                
                switch (modelo.check(states)) {
                    case 1:
                        background.setIcon(ventanaEngFactory.getImgElectCreate());
                        break;
                    case 2:
                        background.setIcon(ventanaEngFactory.getImgCivilCreate());
                        break;
                    default:
                        background.setIcon(ventanaEngFactory.getImgBase());
                        break;
                }
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblElectrical())) {
            if (modelo.check(states) != 1) {
                
                switch (modelo.check(states)) {
                    case 0:
                        background.setIcon(ventanaEngFactory.getImgSoftCreate());
                        break;
                    case 2:
                        background.setIcon(ventanaEngFactory.getImgCivilCreate());
                        break;
                    default:
                        background.setIcon(ventanaEngFactory.getImgBase());
                        break;
                }
            }
        } else if (e.getSource().equals(ventanaEngFactory.getLblCivil())) {
            if (modelo.check(states) != 2) {
                
                switch (modelo.check(states)) {
                    case 0:
                        background.setIcon(ventanaEngFactory.getImgSoftCreate());
                        break;
                    case 1:
                        background.setIcon(ventanaEngFactory.getImgElectCreate());
                        break;
                    default:
                        background.setIcon(ventanaEngFactory.getImgBase());
                        break;
                }
            }
        } else if ((e.getSource().equals(ventanaEngFactory.getLblsProducts()[0]))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[1]))
                || (e.getSource().equals(ventanaEngFactory.getLblsProducts()[2]))) {
            ventanaEngFactory.getLblEngrProduct().setIcon(null);
            
            if (modelo.check(states) == 0) {
                System.out.println("SOFT EXIT!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgSoftCreate());
            } else if (modelo.check(states) == 1) {
                System.out.println("ELECT EXIT!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgElectCreate());
            } else if (modelo.check(states) == 2) {
                System.out.println("CIVIL EXIT!!!");
                ventanaEngFactory.getLblBackground().setIcon(ventanaEngFactory.getImgCivilCreate());
            }
        }
    }
    
}
