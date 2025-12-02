package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "perito")
public class Perito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerito;

    private String registroRaa;
    private String categoriaEspecializacion;
    private int añosExperiencia;
    private String direccion;

    @OneToMany(mappedBy = "perito")
    private List<Avaluo> avaluos;

    public Long getIdPerito() {
        return idPerito;
    }

    public void setIdPerito(Long idPerito) {
        this.idPerito = idPerito;
    }

    public String getRegistroRaa() {
        return registroRaa;
    }

    public void setRegistroRaa(String registroRaa) {
        this.registroRaa = registroRaa;
    }

    public String getCategoriaEspecializacion() {
        return categoriaEspecializacion;
    }

    public void setCategoriaEspecializacion(String categoriaEspecializacion) {
        this.categoriaEspecializacion = categoriaEspecializacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Avaluo> getAvaluos() {
        return avaluos;
    }

    public void setAvaluos(List<Avaluo> avaluos) {
        this.avaluos = avaluos;
    }
}
