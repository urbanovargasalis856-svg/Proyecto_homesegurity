package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCargo;

    private String tipoCargo;

    @ManyToOne
    @JoinColumn(name = "id_administrador")
    private Administrador administrador;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "id_agente_inmobiliario")
    private AgenteInmobiliario agente;

    @OneToOne
    @JoinColumn(name = "id_perito")
    private Perito perito;

    public Long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public AgenteInmobiliario getAgente() {
        return agente;
    }

    public void setAgente(AgenteInmobiliario agente) {
        this.agente = agente;
    }

    public Perito getPerito() {
        return perito;
    }

    public void setPerito(Perito perito) {
        this.perito = perito;
    }
}
