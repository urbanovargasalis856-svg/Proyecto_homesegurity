package Proyecto_HomeSegurity.example.Proyecto_HomeSegurity.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "vivienda")
public class Vivienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVivienda;

    private double metrosCuadrados;
    private int numeroHabitaciones;
    private int numeroBaños;
    private String estadoInmueble;
    private String tipoPropiedad;
    private String direccion;
    private double valorConstruccion;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "id_asesoramiento")
    private Asesoramiento asesoramiento;

    @OneToOne
    @JoinColumn(name = "id_avaluo")
    private Avaluo avaluo;

    @OneToMany(mappedBy = "vivienda")
    private List<ReporteArriendo> reportesArriendo;

    @OneToMany(mappedBy = "vivienda")
    private List<ReporteVenta> reportesVenta;

    public Long getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(Long idVivienda) {
        this.idVivienda = idVivienda;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public String getEstadoInmueble() {
        return estadoInmueble;
    }

    public void setEstadoInmueble(String estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValorConstruccion() {
        return valorConstruccion;
    }

    public void setValorConstruccion(double valorConstruccion) {
        this.valorConstruccion = valorConstruccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Asesoramiento getAsesoramiento() {
        return asesoramiento;
    }

    public void setAsesoramiento(Asesoramiento asesoramiento) {
        this.asesoramiento = asesoramiento;
    }

    public Avaluo getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Avaluo avaluo) {
        this.avaluo = avaluo;
    }

    public List<ReporteArriendo> getReportesArriendo() {
        return reportesArriendo;
    }

    public void setReportesArriendo(List<ReporteArriendo> reportesArriendo) {
        this.reportesArriendo = reportesArriendo;
    }

    public List<ReporteVenta> getReportesVenta() {
        return reportesVenta;
    }

    public void setReportesVenta(List<ReporteVenta> reportesVenta) {
        this.reportesVenta = reportesVenta;
    }
}
