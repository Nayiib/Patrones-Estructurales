package presentacion.vistas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import presentacion.controladores.EngineerFactoryController;
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class EngineerFactoryView extends javax.swing.JFrame {
    
    private Game modelo;
    private EngineerFactoryController ctlEnginnerFactoryView;
    
    private ImageIcon imgBase;
    
    private ImageIcon imgSoftware;
    private ImageIcon imgSoftCreate;
    
    private ImageIcon imgElectrical;
    private ImageIcon imgElectCreate;
    
    private ImageIcon imgCivil;
    private ImageIcon imgCivilCreate;
    
    private ImageIcon imgElectSoft;
    private ImageIcon imgCivilSoft;
    
    private ImageIcon imgSoftElect;
    private ImageIcon imgCivilElect;
    
    private ImageIcon imgSoftCivil;
    private ImageIcon imgElectCivil;
    
    private boolean[] imgStates;
    
    private JLabel[] lblsProducts;
    
    private ImageIcon imgSoftAccessory;
    private ImageIcon imgSoftTool;
    private ImageIcon imgSoftVehicle;
    
    private ImageIcon imgElectAccessory;
    private ImageIcon imgElectTool;
    private ImageIcon imgElectVehicle;
    
    private ImageIcon imgCivilAccessory;
    private ImageIcon imgCivilTool;
    private ImageIcon imgCivilVehicle;
    
    private int numListeners;
    
    public EngineerFactoryView(Game modelo) {
        this.modelo = modelo;
        
        initComponents();
        
        asignarListeners();
        fix();
    }
    
    public void fix() {
        setSize(800, 400);
        setLocationRelativeTo(null);
        
        getCtlEnginnerFactoryView();
        
        imgBase = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base.jpg"));
        
        imgSoftware = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(sistemas).jpg"));
        imgSoftCreate = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion sistemas).jpg"));
        
        imgElectrical = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(electrico).jpg"));
        imgElectCreate = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion electrico).jpg"));
        
        imgCivil = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(civil).jpg"));
        imgCivilCreate = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion civil).jpg"));
        
        imgElectSoft = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion electrico - sistemas).jpg"));
        imgCivilSoft = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion civil - pre sistemas).jpg"));
        
        imgSoftElect = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion sistemas - pre electrica).jpg"));
        imgCivilElect = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion civil - pre electrico).jpg"));
        
        imgSoftCivil = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion sistemas - pre civil).jpg"));
        imgElectCivil = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_base(seleccion electrico - pre civil).jpg"));
        
        imgStates = new boolean[3];
        
        initStates();
        
        lblsProducts = new JLabel[3];
        
        initProdLabels();
        
        imgSoftAccessory = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_sistemas_accessory.jpg"));
        imgSoftTool = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_sistemas_tool.jpg"));
        imgSoftVehicle = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_sistemas_vehicle.jpg"));
        
        imgElectAccessory = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_electrico_accessory.jpg"));
        imgElectTool = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_electrico_tool.jpg"));
        imgElectVehicle = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_electrico_vehicle.jpg"));
        
        imgCivilAccessory = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_civil_accessory.jpg"));
        imgCivilTool = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_civil_tool.jpg"));
        imgCivilVehicle = new ImageIcon(getClass().getResource("/recursos/images/ingeniero_civil_vehicle.jpg"));
        
        numListeners = 0;
    }
    
    public void initStates() {
        for (int i = 0; i < 3; i++) {
            imgStates[i] = false;
        }
    }
    
    public void initProdLabels() {
        lblsProducts[0] = lblAccessory;
        lblsProducts[1] = lblTool;
        lblsProducts[2] = lblVehicle;
    }
    
    public void asignarListeners() {
        lblBackground.addMouseListener(getCtlEnginnerFactoryView());
        lblClose.addMouseListener(getCtlEnginnerFactoryView());
        lblBack.addMouseListener(getCtlEnginnerFactoryView());
        
        lblSoftware.addMouseListener(getCtlEnginnerFactoryView());
        lblElectrical.addMouseListener(getCtlEnginnerFactoryView());
        lblCivil.addMouseListener(getCtlEnginnerFactoryView());
        
        lblOrco.addMouseListener(getCtlEnginnerFactoryView());
    }
    
    public Game getModelo() {
        return modelo;
    }
    
    public EngineerFactoryController getCtlEnginnerFactoryView() {
        if (ctlEnginnerFactoryView == null) {
            ctlEnginnerFactoryView = new EngineerFactoryController(this);
        }
        return ctlEnginnerFactoryView;
    }
    
    public JLabel getLblCreate() {
        return lblCreate;
    }
    
    public ImageIcon getImgCivilCreate() {
        return imgCivilCreate;
    }
    
    public ImageIcon getImgElectCreate() {
        return imgElectCreate;
    }
    
    public ImageIcon getImgSoftCivil() {
        return imgSoftCivil;
    }
    
    public ImageIcon getImgElectCivil() {
        return imgElectCivil;
    }
    
    public ImageIcon getImgCivilElect() {
        return imgCivilElect;
    }
    
    public ImageIcon getImgSoftElect() {
        return imgSoftElect;
    }
    
    public ImageIcon getImgCivilSoft() {
        return imgCivilSoft;
    }
    
    public ImageIcon getImgElectSoft() {
        return imgElectSoft;
    }
    
    public JLabel getLblBackground() {
        return lblBackground;
    }
    
    public JLabel getLblClose() {
        return lblClose;
    }
    
    public JLabel getLblBack() {
        return lblBack;
    }
    
    public JLabel getLblCivil() {
        return lblCivil;
    }
    
    public JLabel getLblElectrical() {
        return lblElectrical;
    }
    
    public JLabel getLblSoftware() {
        return lblSoftware;
    }
    
    public ImageIcon getImgBase() {
        return imgBase;
    }
    
    public ImageIcon getImgSoftware() {
        return imgSoftware;
    }
    
    public ImageIcon getImgElectrical() {
        return imgElectrical;
    }
    
    public ImageIcon getImgCivil() {
        return imgCivil;
    }
    
    public ImageIcon getImgSoftCreate() {
        return imgSoftCreate;
    }
    
    public boolean[] getImgStates() {
        return imgStates;
    }
    
    public JLabel getLblEngrProduct() {
        return lblEngrProduct;
    }
    
    public JLabel[] getLblsProducts() {
        return lblsProducts;
    }
    
    public JLabel getLblAccessory() {
        return lblAccessory;
    }
    
    public ImageIcon getImgSoftAccessory() {
        return imgSoftAccessory;
    }
    
    public ImageIcon getImgSoftTool() {
        return imgSoftTool;
    }
    
    public ImageIcon getImgSoftVehicle() {
        return imgSoftVehicle;
    }
    
    public ImageIcon getImgElectAccessory() {
        return imgElectAccessory;
    }
    
    public ImageIcon getImgElectTool() {
        return imgElectTool;
    }
    
    public ImageIcon getImgElectVehicle() {
        return imgElectVehicle;
    }
    
    public ImageIcon getImgCivilAccessory() {
        return imgCivilAccessory;
    }
    
    public ImageIcon getImgCivilTool() {
        return imgCivilTool;
    }
    
    public ImageIcon getImgCivilVehicle() {
        return imgCivilVehicle;
    }
    
    public int getNumListeners() {
        return numListeners;
    }
    
    public void numListenersIncrement() {
        this.numListeners++;
    }
    
    public void setNumListeners(int numListeners) {
        this.numListeners = numListeners;
    }
    
    public JLabel getLblOrco() {
        return lblOrco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblSoftware = new javax.swing.JLabel();
        lblElectrical = new javax.swing.JLabel();
        lblCivil = new javax.swing.JLabel();
        lblCreate = new javax.swing.JLabel();
        lblEngrProduct = new javax.swing.JLabel();
        lblAccessory = new javax.swing.JLabel();
        lblTool = new javax.swing.JLabel();
        lblVehicle = new javax.swing.JLabel();
        lblOrco = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);
        getContentPane().add(lblClose);
        lblClose.setBounds(764, 0, 30, 20);
        getContentPane().add(lblBack);
        lblBack.setBounds(730, 0, 30, 20);
        getContentPane().add(lblSoftware);
        lblSoftware.setBounds(520, 100, 110, 50);
        getContentPane().add(lblElectrical);
        lblElectrical.setBounds(434, 210, 120, 50);
        getContentPane().add(lblCivil);
        lblCivil.setBounds(630, 210, 70, 50);

        lblCreate.setEnabled(false);
        getContentPane().add(lblCreate);
        lblCreate.setBounds(540, 180, 80, 40);

        lblEngrProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblEngrProduct);
        lblEngrProduct.setBounds(450, 90, 250, 120);
        getContentPane().add(lblAccessory);
        lblAccessory.setBounds(210, 70, 110, 40);
        getContentPane().add(lblTool);
        lblTool.setBounds(210, 180, 110, 40);
        getContentPane().add(lblVehicle);
        lblVehicle.setBounds(210, 300, 110, 40);

        lblOrco.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblOrco.setForeground(new java.awt.Color(255, 255, 255));
        lblOrco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrco.setText("Orco");
        getContentPane().add(lblOrco);
        lblOrco.setBounds(530, 320, 100, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images/ingeniero_base.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAccessory;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCivil;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblElectrical;
    private javax.swing.JLabel lblEngrProduct;
    private javax.swing.JLabel lblOrco;
    private javax.swing.JLabel lblSoftware;
    private javax.swing.JLabel lblTool;
    private javax.swing.JLabel lblVehicle;
    // End of variables declaration//GEN-END:variables
}
