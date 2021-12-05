package vistasTPF;

import controlTPF.GestorCrearProyecto;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Cultivo;
import modeloDatosTPF.Lote;


public class CrearProyecto extends javax.swing.JFrame {

    private GestorCrearProyecto gest;
    private ListSelectionModel tblListModelLotes;
    private ListSelectionModel tblListModelCultivo;
    
    public CrearProyecto(Campo campoElegido) {
        initComponents();
        this.gest = new GestorCrearProyecto();
        gest.setCampoElegido(campoElegido);
        gest.setLotes();//se buscan los lotes disponibles del campo elegido
        cargarTablaLotes();//se cargan los lotes en la tabla de lotes
        btnCrearProy.setEnabled(false);//se deshabilita el boton crear proyecto
        tblListModelLotes = tablaLotes.getSelectionModel();
        tblListModelLotes.addListSelectionListener(new ListSelectionListener () {//permite seleccionar un lote con un click
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                tblListLoteValueChanged(evt);
            }
        });
        tblListModelCultivo = tablaCultivo.getSelectionModel();
        tblListModelCultivo.addListSelectionListener(new ListSelectionListener () {//permite seleccionar un cultivo con un click
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                tblListCultivoValueChanged(evt);
            }
        });
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCultivo = new javax.swing.JTable();
        btnCrearProy = new javax.swing.JButton();

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
        setTitle("Crear Proyecto");

        jLabel1.setText("1) Elija el lote donde iniciar el proyecto");

        tablaLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Lote", "Superficie (ha)", "Tipo de Suelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLotes.setColumnSelectionAllowed(true);
        tablaLotes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaLotes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLotes);
        tablaLotes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaLotes.getColumnModel().getColumnCount() > 0) {
            tablaLotes.getColumnModel().getColumn(0).setResizable(false);
            tablaLotes.getColumnModel().getColumn(1).setResizable(false);
            tablaLotes.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("2) Elija el cultivo");

        tablaCultivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
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
        tablaCultivo.setColumnSelectionAllowed(true);
        tablaCultivo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCultivo.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaCultivo);
        tablaCultivo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaCultivo.getColumnModel().getColumnCount() > 0) {
            tablaCultivo.getColumnModel().getColumn(0).setResizable(false);
            tablaCultivo.getColumnModel().getColumn(1).setResizable(false);
        }

        btnCrearProy.setText("Crear Proyecto");
        btnCrearProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnCrearProy, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnCrearProy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProyActionPerformed
        gest.nuevoProyecto();
        this.dispose();//cierra la ventana sin cerrar el programa
    }//GEN-LAST:event_btnCrearProyActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearProy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaCultivo;
    private javax.swing.JTable tablaLotes;
    // End of variables declaration//GEN-END:variables
    
    public void cargarTablaLotes(){
        String id = new String();
        String superficie = new String();
        String suelo = new String();
        DefaultTableModel tblModel = (DefaultTableModel) tablaLotes.getModel();
        tblModel.setRowCount(0);
        for(Lote l: gest.getLotes()){
            id = String.valueOf(l.getId());
            superficie =Float.toString(l.getSuperficie());
            suelo = String.valueOf(l.getSuelo().getId());
            String[] ids = {id, superficie, suelo};
            tblModel.addRow(ids);
        }
    }
    
    private void tblListLoteValueChanged(ListSelectionEvent evt) {
       if(this.tblListModelLotes.getSelectedItemsCount() > 0) {
            int indice = Integer.parseInt((String)this.tablaLotes.getValueAt(tablaLotes.getSelectedRow(), 0));
            Lote loteElegido = gest.compararLote(indice);
            gest.setLoteElegido(loteElegido);
            gest.setCultivos();
            cargarTablaCultivo();
       }
    }
    
    private void tblListCultivoValueChanged(ListSelectionEvent evt) {
       if(this.tblListModelCultivo.getSelectedItemsCount() > 0) {
            int indice = Integer.parseInt((String)this.tablaCultivo.getValueAt(tablaCultivo.getSelectedRow(), 0));
            Cultivo cultivoElegido = gest.compararCultivo(indice);
            gest.setCultiElegido(cultivoElegido);
            btnCrearProy.setEnabled(true);
       }else{
           btnCrearProy.setEnabled(false);
       }
    }
    
    private void cargarTablaCultivo(){
        String id = new String();
        String nombre = new String();
        DefaultTableModel tblModel = (DefaultTableModel) tablaCultivo.getModel();
        tblModel.setRowCount(0);
        for(Cultivo c: gest.getCultivos()){
            id = String.valueOf(c.getId());
            nombre = String.valueOf(c.getNombre());
            String[] ids = {id, nombre};
            tblModel.addRow(ids);
        }
    }
}
