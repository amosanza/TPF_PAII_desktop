package modeloDatosTPF;
// Generated 31 oct. 2021 21:16:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Campo generated by hbm2java
 */
@Entity
@Table(name="campo"
    ,schema="public"
)
public class Campo  implements java.io.Serializable {


     private int id;
     private String estadocampo;
     private Set<Lote> lotes = new HashSet<Lote>(0);

    public Campo() {
        this.estadocampo = "Creado";
    }
    public Campo(Set<Lote> lotes) {
       this.estadocampo = "Creado";
       this.lotes = lotes;
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

    
    @Column(name="estadocampo", nullable=false)
    public String getEstadocampo() {
        return this.estadocampo;
    }
    
    public void setEstadocampo(String estadocampo) {
        this.estadocampo = estadocampo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="campo")
    public Set<Lote> getLotes() {
        return this.lotes;
    }
    
    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }
    
    public void crearLoteYAgregar(Suelo suelox, float superficie) {//crea un lote y lo agrega a su lista
        Lote lotex = new Lote(this, suelox,  superficie);
        this.lotes.add(lotex);
    }
    
    public Lote crearLoteYRetornar(Suelo suelox, float superficie) {// crea un lote y retorna dicho objeto
        Lote lotex = new Lote(this, suelox,  superficie);
        return lotex;
    }
}


