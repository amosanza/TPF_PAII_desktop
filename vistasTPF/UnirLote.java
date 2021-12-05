package vistasTPF;

import controlTPF.GestorUnirDividirLotes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.MensajeCorrecto;
import modeloDatosTPF.MensajeError;

public class UnirLote extends javax.swing.JFrame {
    
    private GestorUnirDividirLotes gest;
    private ListSelectionModel tblListModelLote;
    private List <String> idsElegidos;
    private int cont;
    
    public UnirLote(Campo campoElegido) {
        initComponents();
        this.idsElegidos = new ArrayList();
        this.cont = 0;
        this.gest = new GestorUnirDividirLotes(campoElegido);
        this.gest.setLotes();
        this.jLabel1.setText("1) Elija los lotes a unir del campo " + gest.getCampoElegido().getId());
        cargarTablaLote();       
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLote = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUnir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unir lotes");

        tablaLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Superficie (ha)", "Tipo de suelo"
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
        tablaLote.setColumnSelectionAllowed(true);
        tablaLote.getTableHeader().setReorderingAllowed(false);
        tablaLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLoteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLote);
        tablaLote.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaLote.getColumnModel().getColumnCount() > 0) {
            tablaLote.getColumnModel().getColumn(0).setResizable(false);
            tablaLote.getColumnModel().getColumn(1).setResizable(false);
            tablaLote.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setText("Los ID de los lotes seleccionados son:");

        btnUnir.setText("Unir");
        btnUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnUnir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnUnir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void tablaLoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLoteMouseClicked
        String id = String.valueOf(this.tablaLote.getValueAt(tablaLote.getSelectedRow(), 0));
        if(!this.idsElegidos.contains(id)){//se controla si el valor clickeado no se encuentra cargado ya en la lista
            this.idsElegidos.add(id);
            if(cont == 0){//se verifica si es la primera vez que se hace click
                this.jLabel2.setText(id);
                this.cont++;
            }else{
                this.jLabel2.setText(this.jLabel2.getText()+", " + id);
            }
        }
    }//GEN-LAST:event_tablaLoteMouseClicked

    private void btnUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirActionPerformed
        this.gest.armarListaElegida(this.idsElegidos);
        if(this.gest.controlarSuelo()){//si tienen el mismo tipo de suelo, se los une
            if(this.gest.getLotesElegidos().size()>1){//se debe elegir más de un lote que para que actue
                this.gest.unirLotes();
                MensajeCorrecto msj = new MensajeCorrecto(3, 3);
                msj.mostrarVentanaCorrecto(this);
                this.dispose();
            }else{
                reiniciar();
            }
        }else{//si no lo tienen se reinician todos los valores
            reiniciar();
            MensajeError msj = new MensajeError(2,3);
            msj.mostrarVentanaError(this);
        }
    }//GEN-LAST:event_btnUnirActionPerformed

    public void reiniciar(){
        this.cont = 0;
        this.idsElegidos.clear();
        this.jLabel2.setText("");
        this.gest.reiniciarListaArmada();
    }
    
    public void cargarTablaLote(){//modulo que carga la tabla con los lotes activos del campo
        String nombre = new String();
        String superficie = new String();
        String suelo = new String();
        AlineaTabla alinear = new AlineaTabla();//clase que permite alinear tablas segun criterio
        DefaultTableModel tblModel = (DefaultTableModel) tablaLote.getModel();
        tblModel.setRowCount(0);
        for(Lote l: gest.getLotes()){
            nombre = String.valueOf(l.getId());
            superficie = String.valueOf(l.getSuperficie());
            suelo = String.valueOf(l.getSuelo().getId());
            String[] arr = {nombre, superficie, suelo};
            tblModel.addRow(arr);
        }
        alinear.alinearCentro(tablaLote);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUnir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLote;
    // End of variables declaration//GEN-END:variables
}
