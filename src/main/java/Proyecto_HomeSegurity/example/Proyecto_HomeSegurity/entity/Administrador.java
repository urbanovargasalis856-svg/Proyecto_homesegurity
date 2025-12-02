package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrador;

    private int añosExperiencia;
    private LocalDate fechaIngreso;

    @OneToMany(mappedBy = "administrador")
    private List<Cargo> cargos;

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
