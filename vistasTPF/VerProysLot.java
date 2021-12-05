package vistasTPF;

import controlTPF.GestorVerProysLot;
import javax.swing.table.DefaultTableModel;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Proyecto;

public class VerProysLot extends javax.swing.JFrame {
    
    private GestorVerProysLot gest;
    
    public VerProysLot(Campo campoElegido) {
        initComponents();
        this.gest = new GestorVerProysLot(campoElegido);
        this.gest.setLotes();
        this.jLabel1.setText("Elija un lote del campo " + campoElegido.getId() + " para ver sus proyectos");
        cargarTablaLotes();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProys = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proyectos del lote");

        tablaLotes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLotes.setColumnSelectionAllowed(true);
        tablaLotes.getTableHeader().setReorderingAllowed(false);
        tablaLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLotesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLotes);
        tablaLotes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaLotes.getColumnModel().getColumnCount() > 0) {
            tablaLotes.getColumnModel().getColumn(0).setResizable(false);
            tablaLotes.getColumnModel().getColumn(1).setResizable(false);
            tablaLotes.getColumnModel().getColumn(2).setResizable(false);
        }

        tablaProys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre cultivo", "Estado", "Situación anormal"
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
        tablaProys.setColumnSelectionAllowed(true);
        tablaProys.getTableHeader().setReorderingAllowed(false);
        tablaProys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProysMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProys);
        tablaProys.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaProys.getColumnModel().getColumnCount() > 0) {
            tablaProys.getColumnModel().getColumn(0).setResizable(false);
            tablaProys.getColumnModel().getColumn(1).setResizable(false);
            tablaProys.getColumnModel().getColumn(2).setResizable(false);
            tablaProys.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(175, 175, 175))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

    private void tablaLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLotesMouseClicked
        this.gest.setLoteElegido(String.valueOf(this.tablaLotes.getValueAt(tablaLotes.getSelectedRow(), 0)));
        this.gest.setProyectos();
        this.jLabel2.setText(this.gest.msjConsultaTieneProys());
        if (this.gest.getProyectos().isEmpty()) {
            this.jLabel3.setText("");
        }else{
            this.jLabel3.setText("Elija uno de los proyectos para ver su historial de laboreos");
        }
        cargarTablaProys();
    }//GEN-LAST:event_tablaLotesMouseClicked

    private void tablaProysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProysMouseClicked
        String idElegido = String.valueOf(this.tablaProys.getValueAt(tablaProys.getSelectedRow(), 0));
        Proyecto proyElegido = this.gest.busqProyecto(idElegido);
        LaboreosHechos vent = new LaboreosHechos(proyElegido);
    }//GEN-LAST:event_tablaProysMouseClicked

    public void cargarTablaLotes(){
        String id = new String();
        String superficie = new String();
        String suelo = new String();
        AlineaTabla alinear = new AlineaTabla();//clase que permite alinear tablas segun criterio
        DefaultTableModel tblModel = (DefaultTableModel) tablaLotes.getModel();
        tblModel.setRowCount(0);
        for(Lote l: gest.getLotes()){
            id = String.valueOf(l.getId());
            superficie =Float.toString(l.getSuperficie());
            suelo = String.valueOf(l.getSuelo().getId());
            String[] arr = {id, superficie, suelo};
            tblModel.addRow(arr);
        }
        alinear.alinearCentro(this.tablaLotes);
    }
    
    public void cargarTablaProys(){
        String id = new String();
        String cultivo = new String();
        String estado = new String();
        String sitAn = new String();
        AlineaTabla alinear = new AlineaTabla();//clase que permite alinear tablas segun criterio
        DefaultTableModel tblModel = (DefaultTableModel) this.tablaProys.getModel();
        tblModel.setRowCount(0);
        for(Proyecto p: gest.getProyectos()){
            id = String.valueOf(p.getId());
            cultivo = this.gest.encontrarCultivo(p).getNombre();
            estado = p.getEstadoproyecto();
            try{//se captura el error en el caso de que el proyecto no tenga una situación anormal
                this.gest.encontrarSitAn(p);
                sitAn = "Si, " + this.gest.encontrarSitAn(p).getNombre();
            }catch(NullPointerException error){
                sitAn = "No";
            }
            String[] arr = {id, cultivo, estado, sitAn};
            tblModel.addRow(arr);
        }
        alinear.alinearCentro(this.tablaProys);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaLotes;
    private javax.swing.JTable tablaProys;
    // End of variables declaration//GEN-END:variables
}
