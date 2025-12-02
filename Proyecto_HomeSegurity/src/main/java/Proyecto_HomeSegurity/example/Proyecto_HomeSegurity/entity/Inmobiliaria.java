package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "inmobiliaria")
public class Inmobiliaria {

    @Id
    private String nitInmobiliaria;

    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaFundacion;
    private String emailContacto;
    private String horarioAtencion;

    @OneToMany(mappedBy = "inmobiliaria")
    private List<AgenteInmobiliario> agentes;

    public String getNitInmobiliaria() {
        return nitInmobiliaria;
    }

    public void setNitInmobiliaria(String nitInmobiliaria) {
        this.nitInmobiliaria = nitInmobiliaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public List<AgenteInmobiliario> getAgentes() {
        return agentes;
    }

    public void setAgentes(List<AgenteInmobiliario> agentes) {
        this.agentes = agentes;
    }
}
