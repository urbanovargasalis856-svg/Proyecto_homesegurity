package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "asesoramiento")
public class Asesoramiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsesoramiento;

    private String observacionesVisita;
    private String tipoAsesoramiento;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_agente_inmobiliario")
    private AgenteInmobiliario agente;

    @ManyToOne
    @JoinColumn(name = "id_citas")
    private Cita cita;

    public Long getIdAsesoramiento() {
        return idAsesoramiento;
    }

    public void setIdAsesoramiento(Long idAsesoramiento) {
        this.idAsesoramiento = idAsesoramiento;
    }

    public String getObservacionesVisita() {
        return observacionesVisita;
    }

    public void setObservacionesVisita(String observacionesVisita) {
        this.observacionesVisita = observacionesVisita;
    }

    public String getTipoAsesoramiento() {
        return tipoAsesoramiento;
    }

    public void setTipoAsesoramiento(String tipoAsesoramiento) {
        this.tipoAsesoramiento = tipoAsesoramiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AgenteInmobiliario getAgente() {
        return agente;
    }

    public void setAgente(AgenteInmobiliario agente) {
        this.agente = agente;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
}
