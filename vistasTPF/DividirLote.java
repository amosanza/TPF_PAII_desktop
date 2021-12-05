package vistasTPF;

import controlTPF.GestorUnirDividirLotes;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.MensajeCorrecto;


public class DividirLote extends javax.swing.JFrame {

    private GestorUnirDividirLotes gest;
    private ListSelectionModel tblListModelLote;
    private int idLoteElegido;
    private int cantidad;
    
    public DividirLote(Campo campoElegido) {
        initComponents();
        this.gest = new GestorUnirDividirLotes(campoElegido);
        this.gest.setLotes();
        this.jLabel1.setText("1) Elija el lote a dividir del campo " + gest.getCampoElegido().getId());
        cargarTablaLote();
        this.jSpinner1.setEnabled(false);
        setVisible(true);
        tblListModelLote = tablaLote.getSelectionModel();//se relaciona con la tabla a cargar
        tblListModelLote.addListSelectionListener(new ListSelectionListener () {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                tblListLoteModelValueChanged(evt);
            }
        }); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLote = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dividir lote");

        tablaLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Superficie (ha)"
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
        tablaLote.setColumnSelectionAllowed(true);
        tablaLote.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLote);
        tablaLote.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaLote.getColumnModel().getColumnCount() > 0) {
            tablaLote.getColumnModel().getColumn(0).setResizable(false);
            tablaLote.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setText("2) Elija la cantidad de lotes en que será dividido");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(2, 2, 100, 1));

        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(190, 190, 190))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(36, 36, 36))
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

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        cantidad = Integer.parseInt(String.valueOf(this.jSpinner1.getValue()));
        gest.dividirLote(this.idLoteElegido, cantidad);
        MensajeCorrecto msj = new MensajeCorrecto(2,2);
        msj.mostrarVentanaCorrecto(this);
        this.dispose();
    }//GEN-LAST:event_btnDividirActionPerformed
    
    public void cargarTablaLote(){//modulo que carga la tabla con los lotes activos del campo
        String nombre = new String();
        String superficie = new String();
        AlineaTabla alinear = new AlineaTabla();//clase que permite alinear tablas segun criterio
        DefaultTableModel tblModel = (DefaultTableModel) tablaLote.getModel();
        tblModel.setRowCount(0);
        for(Lote l: gest.getLotes()){
            nombre = String.valueOf(l.getId());
            superficie = String.valueOf(l.getSuperficie());
            String[] arr = {nombre, superficie};
            tblModel.addRow(arr);
        }
        alinear.alinearCentro(tablaLote);
    }
    
    private void tblListLoteModelValueChanged(ListSelectionEvent evt) {//Se obtiene el valor clickeado
        this.idLoteElegido = Integer.parseInt(String.valueOf(this.tablaLote.getValueAt(tablaLote.getSelectedRow(), 0)));
        this.jSpinner1.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tablaLote;
    // End of variables declaration//GEN-END:variables
}
