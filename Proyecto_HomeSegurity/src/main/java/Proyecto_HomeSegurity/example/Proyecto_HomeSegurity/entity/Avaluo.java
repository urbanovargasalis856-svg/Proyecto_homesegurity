package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "avaluos")
public class Avaluo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvaluos;

    private String tipo;
    private double valor;
    private String estado;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "id_perito")
    private Perito perito;

    @ManyToOne
    @JoinColumn(name = "id_metodologia")
    private Metodologia metodologia;

    @OneToOne(mappedBy = "avaluo")
    private Vivienda vivienda;

    public Long getIdAvaluos() {
        return idAvaluos;
    }

    public void setIdAvaluos(Long idAvaluos) {
        this.idAvaluos = idAvaluos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Perito getPerito() {
        return perito;
    }

    public void setPerito(Perito perito) {
        this.perito = perito;
    }

    public Metodologia getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(Metodologia metodologia) {
        this.metodologia = metodologia;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
}
