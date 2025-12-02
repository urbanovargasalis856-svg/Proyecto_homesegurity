package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "agente_inmobiliario")
public class AgenteInmobiliario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgenteInmobiliario;

    private String numTarjetaProfesional;
    private String zonaEspecialidad;
    private int añosExperiencia;

    @ManyToOne
    @JoinColumn(name = "nit_inmobiliaria")
    private Inmobiliaria inmobiliaria;

    public Long getIdAgenteInmobiliario() {
        return idAgenteInmobiliario;
    }

    public void setIdAgenteInmobiliario(Long idAgenteInmobiliario) {
        this.idAgenteInmobiliario = idAgenteInmobiliario;
    }

    public String getNumTarjetaProfesional() {
        return numTarjetaProfesional;
    }

    public void setNumTarjetaProfesional(String numTarjetaProfesional) {
        this.numTarjetaProfesional = numTarjetaProfesional;
    }

    public String getZonaEspecialidad() {
        return zonaEspecialidad;
    }

    public void setZonaEspecialidad(String zonaEspecialidad) {
        this.zonaEspecialidad = zonaEspecialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public Inmobiliaria getInmobiliaria() {
        return inmobiliaria;
    }

    public void setInmobiliaria(Inmobiliaria inmobiliaria) {
        this.inmobiliaria = inmobiliaria;
    }
}
