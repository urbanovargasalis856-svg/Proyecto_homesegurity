package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "metodologia")
public class Metodologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMetodologia;

    private String nomMetodologia;
    private String descripcion;
    private String objetivos;
    private String fasesProceso;
    private String beneficios;
    private String recomendaciones;

    @OneToMany(mappedBy = "metodologia")
    private List<Avaluo> avaluos;

    public Long getIdMetodologia() {
        return idMetodologia;
    }

    public void setIdMetodologia(Long idMetodologia) {
        this.idMetodologia = idMetodologia;
    }

    public String getNomMetodologia() {
        return nomMetodologia;
    }

    public void setNomMetodologia(String nomMetodologia) {
        this.nomMetodologia = nomMetodologia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getFasesProceso() {
        return fasesProceso;
    }

    public void setFasesProceso(String fasesProceso) {
        this.fasesProceso = fasesProceso;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public List<Avaluo> getAvaluos() {
        return avaluos;
    }

    public void setAvaluos(List<Avaluo> avaluos) {
        this.avaluos = avaluos;
    }
}
