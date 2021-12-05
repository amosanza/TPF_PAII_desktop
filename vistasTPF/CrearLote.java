package vistasTPF;

import controlTPF.GestorCrearLote;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modeloDatosTPF.Campo;
import modeloDatosTPF.MensajeCorrecto;
import modeloDatosTPF.MensajeError;
import modeloDatosTPF.Porcentaje;
import modeloDatosTPF.Suelo;


public class CrearLote extends javax.swing.JFrame {
    
    private GestorCrearLote gest = new GestorCrearLote();
    private ListSelectionModel tblListModelSuelo;
            
    public CrearLote(Campo campoElegido) {
        initComponents();
        gest.setCampoElegido(campoElegido);
        this.setTitle("Creando lote en el campo " + String.valueOf(campoElegido.getId()));
        this.btnCrear.setEnabled(false);
        cargarTablaSuelo();
        setVisible(true);
        tblListModelSuelo = tablaSuelo.getSelectionModel();//se relaciona con la tabla a cargar
        tblListModelSuelo.addListSelectionListener(new ListSelectionListener () {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                tblListSueloModelValueChanged(evt);
            }
        });       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSuelo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMineral = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaSuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de suelo", "¿Tiene lagunas?", "¿Tiene piedras?", "% de humedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSuelo.setColumnSelectionAllowed(true);
        tablaSuelo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaSuelo);
        tablaSuelo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaSuelo.getColumnModel().getColumnCount() > 0) {
            tablaSuelo.getColumnModel().getColumn(0).setResizable(false);
            tablaSuelo.getColumnModel().getColumn(1).setResizable(false);
            tablaSuelo.getColumnModel().getColumn(2).setResizable(false);
            tablaSuelo.getColumnModel().getColumn(3).setResizable(false);
        }

        tablaMineral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaMineral.setRowSelectionAllowed(false);
        tablaMineral.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaMineral);
        if (tablaMineral.getColumnModel().getColumnCount() > 0) {
            tablaMineral.getColumnModel().getColumn(0).setResizable(false);
            tablaMineral.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setText("2) Indique la superficie (en ha) que posee el lote");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel4.setText("1) Elija el tipo de suelo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(253, 253, 253))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPantalla)
                                .addGap(269, 269, 269))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPantalla)
                        .addGap(72, 72, 72)
                        .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String band = this.gest.controlCarga(this.txtPantalla.getText());
        if(band == null){//no hubo error en la carga
            MensajeCorrecto msjC ;
            this.gest.crearLote();
            msjC = new MensajeCorrecto(1, 1);
            msjC.mostrarVentanaCorrecto(this);
            this.dispose();
        }else{//error en la carga
            MensajeError msjE;
            if(band.equals("Debe escribir un formato de número válido")){
                msjE = new MensajeError(1, 1);
                msjE.mostrarVentanaError(this);
            }
            if(band.equals("Número fuera del rango de valores admitidos (Entre 0 y 1000 ha)")){
                msjE = new MensajeError(1, 2);
                msjE.mostrarVentanaError(this);
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMineral;
    private javax.swing.JTable tablaSuelo;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
    
    public void cargarTablaSuelo(){//modulo que carga la tabla con los suelos existentes
        String id = new String();
        String laguna = new String();
        String piedra = new String();
        String humedad = new String();
        AlineaTabla alinear = new AlineaTabla();//clase que permite alinear tablas segun criterio
        DefaultTableModel tblModel = (DefaultTableModel) tablaSuelo.getModel();
        tblModel.setRowCount(0);
        for(Suelo s: gest.getGestorSuelo().getSuelos()){//Lista obtenida directamente desde la base de datos
            id = String.valueOf(s.getId());
            if(s.getLagunas()){
                laguna  = "Si";
            }else{
                laguna  = "No";
            }
            if(s.getPiedras()){
                piedra  = "Si";
            }else{
                piedra  = "No";
            }
            humedad = String.valueOf(s.getHumedad());
            String[] ids = {id, laguna, piedra, humedad};
            tblModel.addRow(ids);
        }
        alinear.alinearCentro(tablaSuelo); 
    }
    
    private void tblListSueloModelValueChanged(ListSelectionEvent evt) {//Se obtiene el valor clickeado
        gest.elegirSuelo(String.valueOf(this.tablaSuelo.getValueAt(tablaSuelo.getSelectedRow(), 0)));
        this.btnCrear.setEnabled(true);
        this.jLabel2.setText("Minerales del tipo de suelo " + String.valueOf(gest.getSueloElegido().getId()));
        cargarTablaMineral();
    }
    
    public void cargarTablaMineral(){//modulo que carga la tabla con los minerales de los suelos a modo informativo
        String nombre = new String();
        String porcent = new String();
        DefaultTableModel tblModel = (DefaultTableModel) tablaMineral.getModel();
        tblModel.setRowCount(0);
        for(Porcentaje p: gest.devolverPorcentaje()){//Lista obtenida directamente desde la base de datos
            nombre = gest.devolverMineral(p).getNombre();//Variable obtenida directamente desde la base de datos
            porcent = String.valueOf(p.getCantidad());
            String[] ids = {nombre, porcent};
            tblModel.addRow(ids);
        }
    }
}
