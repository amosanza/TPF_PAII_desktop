package vistasTPF;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class AlineaTabla {
    private DefaultTableCellRenderer alinear;

    public AlineaTabla() {
        this.alinear = new DefaultTableCellRenderer();
    }
    
    public void alinearCentro(JTable tabla){
        this.alinear.setHorizontalAlignment(SwingConstants.CENTER);
        for(int i=0;i<tabla.getColumnModel().getColumnCount();i++){
            tabla.getColumnModel().getColumn(i).setCellRenderer(this.alinear);
        }
    }
}
