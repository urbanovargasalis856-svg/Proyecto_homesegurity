package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "reporte_venta")
public class ReporteVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporteVenta;

    private double valorVenta;
    private double gastosAdministracion;
    private double gastosSeguro;
    private double valorInmueble;

    @ManyToOne
    @JoinColumn(name = "id_vivienda")
    private Vivienda vivienda;

    public Long getIdReporteVenta() {
        return idReporteVenta;
    }

    public void setIdReporteVenta(Long idReporteVenta) {
        this.idReporteVenta = idReporteVenta;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double getGastosAdministracion() {
        return gastosAdministracion;
    }

    public void setGastosAdministracion(double gastosAdministracion) {
        this.gastosAdministracion = gastosAdministracion;
    }

    public double getGastosSeguro() {
        return gastosSeguro;
    }

    public void setGastosSeguro(double gastosSeguro) {
        this.gastosSeguro = gastosSeguro;
    }

    public double getValorInmueble() {
        return valorInmueble;
    }

    public void setValorInmueble(double valorInmueble) {
        this.valorInmueble = valorInmueble;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
}
