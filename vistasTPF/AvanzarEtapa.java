package vistasTPF;

import controlTPF.GestorModProy;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.MensajeCorrecto;


public class AvanzarEtapa extends javax.swing.JFrame {
    
    private GestorModProy gest;
    private int cont =0;
    
    public AvanzarEtapa(Campo campoElegido) {
        initComponents();
        this.gest = new GestorModProy(campoElegido);
        this.gest.setLotes();
        this.jLabel1.setText("1) Elija alguno de los siguientes lotes del campo " + campoElegido.getId());
        for(Lote l: this.gest.getLotes()){
            this.comboLote.addItem(String.valueOf(l.getId()));
        }
        this.btnAvanzar.setEnabled(false);
        this.btnCancelarProy.setEnabled(false);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboLote = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProy = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDetallesActual = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProxLabo = new javax.swing.JTable();
        btnAvanzar = new javax.swing.JToggleButton();
        btnCancelarProy = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avanzar etapa proyecto");

        comboLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLoteActionPerformed(evt);
            }
        });

        jLabel2.setText("Proyecto");

        tablaProy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre cultivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProy.setRowHeight(20);
        tablaProy.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProy);
        if (tablaProy.getColumnModel().getColumnCount() > 0) {
            tablaProy.getColumnModel().getColumn(0).setResizable(false);
            tablaProy.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setText("Estado actual del proyecto");

        tablaDetallesActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha inicio", "Etapa proyecto", "Paso", "Laboreo", "Estado cultivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDetallesActual.setRowHeight(19);
        tablaDetallesActual.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaDetallesActual);
        if (tablaDetallesActual.getColumnModel().getColumnCount() > 0) {
            tablaDetallesActual.getColumnModel().getColumn(0).setResizable(false);
            tablaDetallesActual.getColumnModel().getColumn(1).setResizable(false);
            tablaDetallesActual.getColumnModel().getColumn(2).setResizable(false);
            tablaDetallesActual.getColumnModel().getColumn(3).setResizable(false);
            tablaDetallesActual.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel4.setText("Siguiente etapa del proyecto");

        tablaProxLabo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Etapa proyecto", "Paso", "Laboreo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProxLabo.setRowHeight(20);
        tablaProxLabo.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaProxLabo);
        if (tablaProxLabo.getColumnModel().getColumnCount() > 0) {
            tablaProxLabo.getColumnModel().getColumn(0).setResizable(false);
            tablaProxLabo.getColumnModel().getColumn(1).setResizable(false);
            tablaProxLabo.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAvanzar.setText("Avanzar");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnCancelarProy.setText("Cancelar Proyecto");
        btnCancelarProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarProy, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboLote, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboLote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarProy, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnAvanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

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

    private void comboLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLoteActionPerformed
        if(cont==0){//controla que sea la primera vez que se ingresa a la ventana
            cont++;
        }else{
            this.gest.setLoteElegido(this.comboLote.getSelectedItem().toString());
            this.gest.cargarDatos();//se inicilizan los datos del gestor en funcion del lote elegido
            cargarTablaProy();           
            cargarTablaDetallesActual();
            this.btnAvanzar.setEnabled(true);
            this.btnCancelarProy.setEnabled(true);
            if(this.gest.getSiguiOrden()!=null){
                cargarTablaProxLabo();
            }else{
                this.jLabel4.setText("Es la última etapa del proyecto");
            }
            
        }
    }//GEN-LAST:event_comboLoteActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        String mensaje = "¿Esta seguro que desea avanzar a la siguiente etapa?";
        String titulo = "Avanzar etapa proyecto";
        int resp =  JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.YES_OPTION){
            procesarConsultaBoton();
            this.dispose();
        }
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnCancelarProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProyActionPerformed
        String mensaje = "¿Esta seguro que desea cancelar el proyecto?";
        String titulo = "Cancelar proyecto";
        int resp =  JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.YES_OPTION){
            mensaje = "Si el motivo para cancelar el proyecto es porque no nació el cultivo debe retroceder y continuar en 'Avanzar'";
            JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
            procesarConsultaCancelar();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarProyActionPerformed

    public void cargarTablaProy(){
        String id = new String();
        String cultivo = new String();
        AlineaTabla alinear = new AlineaTabla();//clase que permite alinear tablas segun criterio
        DefaultTableModel tblModel = (DefaultTableModel) this.tablaProy.getModel();
        tblModel.setRowCount(0);
        id = String.valueOf(this.gest.getProyActual().getId());
        cultivo = this.gest.busqCulti().getNombre();
        String[] arr = {id, cultivo};
        tblModel.addRow(arr);
        alinear.alinearCentro(this.tablaProy); 
    }
    
    public void cargarTablaDetallesActual(){
        String fechaInicio = new String();
        String etPro = new String();
        String paso = new String();
        String laboreo = new String();
        String estCulti = new String();
        AlineaTabla alinear = new AlineaTabla();
        DefaultTableModel tblModel = (DefaultTableModel) this.tablaDetallesActual.getModel();
        tblModel.setRowCount(0);
        fechaInicio = String.valueOf(this.gest.getDetProActual().getFechainicio());
        etPro = this.gest.busqEtPro(this.gest.getOrdenActual()).getNombre();
        paso = String.valueOf(this.gest.getOrdenActual().getOrdenejecucion());
        laboreo = this.gest.busqLaboreo(this.gest.getOrdenActual()).getNombre();
        estCulti = this.gest.getDetProActual().getEstadoproyecto();
        String[] arr = {fechaInicio, etPro, paso, laboreo, estCulti};
        tblModel.addRow(arr);
        alinear.alinearCentro(this.tablaDetallesActual); 
    }
    
    public void cargarTablaProxLabo(){
        String etPro = new String();
        String paso = new String();
        String laboreo = new String();
        AlineaTabla alinear = new AlineaTabla();
        DefaultTableModel tblModel = (DefaultTableModel) this.tablaProxLabo.getModel();
        tblModel.setRowCount(0);       
        etPro = this.gest.busqEtPro(this.gest.getSiguiOrden()).getNombre();
        paso = String.valueOf(this.gest.getSiguiOrden().getOrdenejecucion());
        laboreo = this.gest.busqLaboreo(this.gest.getSiguiOrden()).getNombre();
        String[] arr = {etPro, paso, laboreo};
        tblModel.addRow(arr);
        alinear.alinearCentro(this.tablaProxLabo); 
    }
    
    public void procesarConsultaBoton(){
        boolean band = true;
        if(this.gest.getSiguiOrden()!=null){//si no es null no es el ultimo orden del cultivo
            MensajeCorrecto msj = new MensajeCorrecto(1,4);
            if(this.gest.pasarAPostSiembra()){//cuando se pasa a la etapa de post siembra, se consulta
                band=consultaNacido();
            }
            if(band){//si band es falso es porque el cultivo no ha nacido, por lo que no se puede avanzar a la siguiente etapa
                this.gest.avanzarEtapa();
                msj.mostrarVentanaCorrecto(this);
            }
        }else{//es el último orden
            MensajeCorrecto msj = new MensajeCorrecto(1,7);
            this.gest.cambiarEstadoProy("Finalizado");
            this.gest.finalizarDetPro();
            msj.mostrarVentanaCorrecto(this);
        }
    }
    
    public boolean consultaNacido() {
        boolean band = false;
        String mensaje = "Está por pasar a la etapa de post siembra ¿El cultivo ha nacido?";
        String titulo = "Consulta nacimiento cultivo";
        int resp = JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == JOptionPane.NO_OPTION) {//el cultivo no ha nacido
            mensaje = "¿Desea volver a sembrarlo?";
            resp = JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp != JOptionPane.CANCEL_OPTION) {
                cultivoNoNacido(resp);
            }
        } else if (resp == JOptionPane.YES_OPTION) {//el cultivo ha nacido
            band = true;
        }
        return band;
    }

    public void cultivoNoNacido(int resp) {
        MensajeCorrecto msj = null;
        this.gest.getDetProActual().setEstadoproyecto("No nacido");
        if (resp == JOptionPane.YES_OPTION) {//se desea re sembrar
            msj = new MensajeCorrecto(1, 5);
            this.gest.resembrar();
        } else if (resp == JOptionPane.NO_OPTION) {//se desea cancelar el proyecto
            msj = new MensajeCorrecto(1,6);
            this.gest.cancelarProyecto();
        }
        msj.mostrarVentanaCorrecto(this);
    }
    
        public void procesarConsultaCancelar(){
        String[] arreglo = this.gest.crearArreglo();
        String mensaje = "¿Qué situación se dió para cancelar el proyecto?";
        String titulo = "Cancelar proyecto";
        String resp = (String) JOptionPane.showInputDialog(this, mensaje, titulo, JOptionPane.DEFAULT_OPTION, null, arreglo, arreglo[0]);
        if (resp != null) {
            this.gest.encontrarSitAnProy(resp);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAvanzar;
    private javax.swing.JButton btnCancelarProy;
    private javax.swing.JComboBox<String> comboLote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaDetallesActual;
    private javax.swing.JTable tablaProxLabo;
    private javax.swing.JTable tablaProy;
    // End of variables declaration//GEN-END:variables
}
