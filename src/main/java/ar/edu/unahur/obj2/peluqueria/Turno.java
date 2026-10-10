package ar.edu.unahur.obj2.peluqueria;

import ar.edu.unahur.obj2.peluqueria.excepciones.CantidadInvalidaException;
import ar.edu.unahur.obj2.peluqueria.servicio.Servicio;

public class Turno {
    // atributos------------------
    private Cliente cliente;
    private Servicio servicio;
    private Integer cantidadSeciones;
    private Double importeTotal;
    private Boolean confirmado;

    // constructor---------------
    public Turno(Cliente cliente, Servicio servicio, Integer cantidadSeciones) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.cantidadSeciones = validarCantidadSeciones(cantidadSeciones);
        this.confirmado = false;
    }

    // getters---------------------------
    public Cliente getCliente() {
        return cliente;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public Integer getCantidadSeciones() {
        return cantidadSeciones;
    }
    public Double getImporteTotal() {
        return importeTotal;
    }

    // Metodos-----------------------------
    public Integer validarCantidadSeciones(Integer cantidadSeciones){
        if(cantidadSeciones <= 0){
            throw new CantidadInvalidaException("la cantidad de seciones debe ser mayor a 0.");
        }
        return cantidadSeciones;
    }

    public Double confirmarTurno(RecargoPorInsumos recargoPorInsumos){

            Double precioBase = servicio.getPrecioBase() * cantidadSeciones;
            Double conDescuentos = cliente.getCategoria().importeTotal(precioBase);
            this.importeTotal = conDescuentos + recargoPorInsumos.getInsumos();
        
        this.confirmado = true;
        servicio.restarCantidadDeCupos(cantidadSeciones);
        cliente.agregarAlIstorialCliente(this);
        
        return 0.0;
    }

}
