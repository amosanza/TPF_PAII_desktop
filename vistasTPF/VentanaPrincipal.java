package vistasTPF;

import controlTPF.GestorActEstCampo;
import controlTPF.GestorBuscarCampo;
import controlTPF.GestorCrearCampo;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modeloDatosTPF.HibernateUtil;
import modeloDatosTPF.MensajeCorrecto;


public class VentanaPrincipal extends javax.swing.JFrame {

    private GestorBuscarCampo gest;
    private GestorActEstCampo gestAct; 
    
    public VentanaPrincipal(){
        initComponents();
        ImageIcon imagen2 = new ImageIcon("src/Imagenes/trigo.png");
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);
        this.repaint();
        jLabel1.setHorizontalAlignment(JLabel.CENTER);       
        this.setLocationRelativeTo(null);
        this.gest = new GestorBuscarCampo();
        gest.setCampos();
        this.gestAct = new GestorActEstCampo();
        this.menuLote.setEnabled(false);
        this.menuProyectos.setEnabled(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCampo = new javax.swing.JMenu();
        miCrearCampo = new javax.swing.JMenuItem();
        miBuscarCampo = new javax.swing.JMenuItem();
        miVerEC = new javax.swing.JMenuItem();
        miCampoDesuso = new javax.swing.JMenuItem();
        menuLote = new javax.swing.JMenu();
        miCrearLote = new javax.swing.JMenuItem();
        miUnirLote = new javax.swing.JMenuItem();
        miDividirLote = new javax.swing.JMenuItem();
        miVPL = new javax.swing.JMenuItem();
        menuProyectos = new javax.swing.JMenu();
        miCrearProy = new javax.swing.JMenuItem();
        miModProy = new javax.swing.JMenuItem();
        miVentAyuda = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Agro S.R.L.");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );

        menuCampo.setText("Campos");

        miCrearCampo.setText("Crear campo");
        miCrearCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearCampoActionPerformed(evt);
            }
        });
        menuCampo.add(miCrearCampo);

        miBuscarCampo.setText("Buscar campo");
        miBuscarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarCampoActionPerformed(evt);
            }
        });
        menuCampo.add(miBuscarCampo);

        miVerEC.setText("Ver estado campos");
        miVerEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVerECActionPerformed(evt);
            }
        });
        menuCampo.add(miVerEC);

        miCampoDesuso.setText("Campo en desuso");
        miCampoDesuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCampoDesusoActionPerformed(evt);
            }
        });
        menuCampo.add(miCampoDesuso);

        jMenuBar1.add(menuCampo);

        menuLote.setText("Lotes");

        miCrearLote.setText("Crear lote");
        miCrearLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearLoteActionPerformed(evt);
            }
        });
        menuLote.add(miCrearLote);

        miUnirLote.setText("Unir lotes");
        miUnirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnirLoteActionPerformed(evt);
            }
        });
        menuLote.add(miUnirLote);

        miDividirLote.setText("Dividir lotes");
        miDividirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDividirLoteActionPerformed(evt);
            }
        });
        menuLote.add(miDividirLote);

        miVPL.setText("Ver proyectos de un lote");
        miVPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVPLActionPerformed(evt);
            }
        });
        menuLote.add(miVPL);

        jMenuBar1.add(menuLote);

        menuProyectos.setText("Proyectos");

        miCrearProy.setText("Crear proyecto");
        miCrearProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearProyActionPerformed(evt);
            }
        });
        menuProyectos.add(miCrearProy);

        miModProy.setText("Modificar proyecto");
        miModProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModProyActionPerformed(evt);
            }
        });
        menuProyectos.add(miModProy);

        jMenuBar1.add(menuProyectos);

        miVentAyuda.setText("Ayuda");

        jMenuItem10.setText("Ver ayuda");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        miVentAyuda.add(jMenuItem10);

        jMenuBar1.add(miVentAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCrearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearCampoActionPerformed
        GestorCrearCampo gcc = new GestorCrearCampo();
        int i;
        String mensaje = "¿Está seguro que desea crear un nuevo campo?";
        String titulo = "Nuevo campo";
        i = JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == JOptionPane.YES_OPTION) {
            gcc.crearCampo();
        }
    }//GEN-LAST:event_miCrearCampoActionPerformed

    private void miUnirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnirLoteActionPerformed
        UnirLote vent = new UnirLote(this.gest.getCampoElegido());
    }//GEN-LAST:event_miUnirLoteActionPerformed

    private void miBuscarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarCampoActionPerformed
        this.gest.setCampos();//se actualiza la lista de campos existentes
        String[] arreglo = new String[this.gest.getCampos().size()];
        arreglo = this.gest.crearArreglo();//JOptionPane solamente acepta arreglos, por eso se lo convierte
        String mensaje = "Seleccione el campo a trabajar";
        String titulo = "Busqueda de campo";
        String resp = (String) JOptionPane.showInputDialog(this, mensaje, titulo, JOptionPane.DEFAULT_OPTION, null, arreglo, arreglo[0]);
        if (resp != null) {
            this.gest.elegirCampo(resp);
            //habilitarMenues();
            //habilitarMIproy();
        }
        
    }//GEN-LAST:event_miBuscarCampoActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        HibernateUtil.openSessionAndBindToThread();
        HibernateUtil.closeSessionFactory();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        VentanaAyuda vent = new VentanaAyuda();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void miCrearProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearProyActionPerformed
        CrearProyecto vent = new CrearProyecto(gest.getCampoElegido());
    }//GEN-LAST:event_miCrearProyActionPerformed

    private void miCrearLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearLoteActionPerformed
        CrearLote vent = new CrearLote(this.gest.getCampoElegido());
    }//GEN-LAST:event_miCrearLoteActionPerformed

    private void miVerECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVerECActionPerformed
        EstadosCampo busq = new EstadosCampo(this.gest);
        busq.cargarTabla();
    }//GEN-LAST:event_miVerECActionPerformed

    private void miDividirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDividirLoteActionPerformed
        DividirLote vent = new DividirLote(this.gest.getCampoElegido());
    }//GEN-LAST:event_miDividirLoteActionPerformed

    private void miVPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVPLActionPerformed
        VerProysLot vent = new VerProysLot(this.gest.getCampoElegido());
    }//GEN-LAST:event_miVPLActionPerformed

    private void miModProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModProyActionPerformed
        AvanzarEtapa vent = new AvanzarEtapa(this.gest.getCampoElegido());
    }//GEN-LAST:event_miModProyActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        habilitarMenues();
        habilitarMIproy();
        this.gestAct.actualizarEstCampo();
    }//GEN-LAST:event_formWindowGainedFocus

    private void miCampoDesusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCampoDesusoActionPerformed
        this.gestAct.setCamposEnDesuso();
        String [] arreglo = this.gestAct.convCEDenArray();
        String mensaje = "¿Desea poner en desuso alguno de los siguientes campos?";
        String titulo = "Campos en desuso";
        String resp = (String) JOptionPane.showInputDialog(this, mensaje, titulo, JOptionPane.DEFAULT_OPTION, null, arreglo, arreglo[0]);
        if (resp != null) {
            MensajeCorrecto msj = new MensajeCorrecto(4, 8);
            this.gestAct.ponerEnDesusoCampo(resp);
            msj.mostrarVentanaCorrecto(this);
        } else {
            this.gestAct.limpiarListaCamposEnDesuso();
        }
    }//GEN-LAST:event_miCampoDesusoActionPerformed

    private void habilitarMenues(){//cada vez que se busca un campo se consulta para habilitar los menues de Lote y Proyecto
        if(gest.getCampoElegido().getId()>0){
            this.menuLote.setEnabled(true);
        }
        this.gest.verTieneLotes();
        if(gest.isTieneLotes()){
            this.miUnirLote.setEnabled(true);
            this.miDividirLote.setEnabled(true);
            this.menuProyectos.setEnabled(true);
        }else{
            this.miUnirLote.setEnabled(false);
            this.miDividirLote.setEnabled(false);
            this.menuProyectos.setEnabled(false);
        }
    }

    private void habilitarMIproy(){
        this.gest.setTieneProyectos(false);
        this.gest.verTieneProyectos();
        if(gest.isTieneProyectos()){
            this.miModProy.setEnabled(true);
        }else{
            this.miModProy.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuCampo;
    private javax.swing.JMenu menuLote;
    private javax.swing.JMenu menuProyectos;
    private javax.swing.JMenuItem miBuscarCampo;
    private javax.swing.JMenuItem miCampoDesuso;
    private javax.swing.JMenuItem miCrearCampo;
    private javax.swing.JMenuItem miCrearLote;
    private javax.swing.JMenuItem miCrearProy;
    private javax.swing.JMenuItem miDividirLote;
    private javax.swing.JMenuItem miModProy;
    private javax.swing.JMenuItem miUnirLote;
    private javax.swing.JMenuItem miVPL;
    private javax.swing.JMenu miVentAyuda;
    private javax.swing.JMenuItem miVerEC;
    // End of variables declaration//GEN-END:variables

}
