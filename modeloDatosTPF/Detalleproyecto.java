package modeloDatosTPF;
// Generated 31 oct. 2021 21:16:53 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Detalleproyecto generated by hbm2java
 */
@Entity
@Table(name="detalleproyecto"
    ,schema="public"
)
public class Detalleproyecto  implements java.io.Serializable {


     private int id;
     private Orden orden;
     private Proyecto proyecto;
     private Date fechainicio;
     private Date fechafin;
     private String estadoproyecto;

    public Detalleproyecto() {
    }

	
    public Detalleproyecto(Orden orden, Proyecto proyecto) {
        this.orden = orden;
        this.proyecto = proyecto;
    }
    public Detalleproyecto(Orden orden, Proyecto proyecto, Date fechainicio, Date fechafin, String estadoproyecto) {
       this.orden = orden;
       this.proyecto = proyecto;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.estadoproyecto = estadoproyecto;
    }
   
     @Id 
    @Column(name="id", unique=true, nullable=false)
    @GeneratedValue(strategy = IDENTITY)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkorden", nullable=false)
    public Orden getOrden() {
        return this.orden;
    }
    
    public void setOrden(Orden orden) {
        this.orden = orden;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkproyecto", nullable=false)
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechainicio", length=13)
    public Date getFechainicio() {
        return this.fechainicio;
    }
    
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechafin", length=13)
    public Date getFechafin() {
        return this.fechafin;
    }
    
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    
    @Column(name="estadoproyecto")
    public String getEstadoproyecto() {
        return this.estadoproyecto;
    }
    
    public void setEstadoproyecto(String estadoproyecto) {
        this.estadoproyecto = estadoproyecto;
    }

    public boolean equals(int i){
        return Objects.equals(this.id, i);
    }


}