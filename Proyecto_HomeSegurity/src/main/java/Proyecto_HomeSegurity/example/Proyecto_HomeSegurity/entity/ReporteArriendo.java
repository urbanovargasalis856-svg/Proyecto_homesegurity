package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "reporte_arriendo")
public class ReporteArriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporteArriendo;

    private double valorArriendo;
    private double gastosAdministracion;
    private double gastosPoliza;
    private double valorInmueble;

    @ManyToOne
    @JoinColumn(name = "id_vivienda")
    private Vivienda vivienda;

    public Long getIdReporteArriendo() {
        return idReporteArriendo;
    }

    public void setIdReporteArriendo(Long idReporteArriendo) {
        this.idReporteArriendo = idReporteArriendo;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public double getGastosAdministracion() {
        return gastosAdministracion;
    }

    public void setGastosAdministracion(double gastosAdministracion) {
        this.gastosAdministracion = gastosAdministracion;
    }

    public double getGastosPoliza() {
        return gastosPoliza;
    }

    public void setGastosPoliza(double gastosPoliza) {
        this.gastosPoliza = gastosPoliza;
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
