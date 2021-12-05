package modeloDatosTPF;
// Generated 31 oct. 2021 21:16:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Orden generated by hbm2java
 */
@Entity
@Table(name="orden"
    ,schema="public"
)
public class Orden  implements java.io.Serializable {


     private int id;
     private Cultivo cultivo;
     private Etapaproyecto etapaproyecto;
     private Laboreo laboreo;
     private int ordenejecucion;
     private Set<Detalleproyecto> detalleproyectos = new HashSet<Detalleproyecto>(0);

    public Orden() {
    }

	
    public Orden(Cultivo cultivo, Etapaproyecto etapaproyecto, Laboreo laboreo, int ordenejecucion) {
        this.cultivo = cultivo;
        this.etapaproyecto = etapaproyecto;
        this.laboreo = laboreo;
        this.ordenejecucion = ordenejecucion;
    }
    public Orden(Cultivo cultivo, Etapaproyecto etapaproyecto, Laboreo laboreo, int ordenejecucion, Set<Detalleproyecto> detalleproyectos) {
       this.cultivo = cultivo;
       this.etapaproyecto = etapaproyecto;
       this.laboreo = laboreo;
       this.ordenejecucion = ordenejecucion;
       this.detalleproyectos = detalleproyectos;
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
    @JoinColumn(name="fkcultivo", nullable=false)
    public Cultivo getCultivo() {
        return this.cultivo;
    }
    
    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fketapaproyecto", nullable=false)
    public Etapaproyecto getEtapaproyecto() {
        return this.etapaproyecto;
    }
    
    public void setEtapaproyecto(Etapaproyecto etapaproyecto) {
        this.etapaproyecto = etapaproyecto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fklaboreo", nullable=false)
    public Laboreo getLaboreo() {
        return this.laboreo;
    }
    
    public void setLaboreo(Laboreo laboreo) {
        this.laboreo = laboreo;
    }

    
    @Column(name="ordenejecucion", nullable=false)
    public int getOrdenejecucion() {
        return this.ordenejecucion;
    }
    
    public void setOrdenejecucion(int ordenejecucion) {
        this.ordenejecucion = ordenejecucion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="orden")
    public Set<Detalleproyecto> getDetalleproyectos() {
        return this.detalleproyectos;
    }
    
    public void setDetalleproyectos(Set<Detalleproyecto> detalleproyectos) {
        this.detalleproyectos = detalleproyectos;
    }

    public boolean equals(Orden ordenx){
        return Objects.equals(this.id, ordenx.getId());
    }


}


