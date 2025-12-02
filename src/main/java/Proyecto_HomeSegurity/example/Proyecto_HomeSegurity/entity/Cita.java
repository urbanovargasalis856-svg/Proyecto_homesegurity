package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCitas;

    private String direccion;
    private LocalDate fecha;
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "cita")
    private List<Asesoramiento> asesoramientos;

    public Long getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Long idCitas) {
        this.idCitas = idCitas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Asesoramiento> getAsesoramientos() {
        return asesoramientos;
    }

    public void setAsesoramientos(List<Asesoramiento> asesoramientos) {
        this.asesoramientos = asesoramientos;
    }
}
