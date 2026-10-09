package ar.edu.unahur.obj2.peluqueria;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.peluqueria.categoria.Categoria;
import ar.edu.unahur.obj2.peluqueria.categoria.Vip;
import ar.edu.unahur.obj2.peluqueria.excepciones.CategoriaNoAutorizadaException;
import ar.edu.unahur.obj2.peluqueria.excepciones.ClienteSinTurnosException;

public class Cliente {

    // atributos----------------------------------------------------------------
    private String nombre;
    private Categoria categoria;
    private List<Turno> historialDeTurnos;

    // constructor-------------------------------------------------------------------
    public Cliente(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = validacionCategoria(categoria);
        this.historialDeTurnos = new ArrayList<>();
    }

    // getter-------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public List<Turno> getHistorialDeTurnos() {
        if (historialDeTurnos.isEmpty()){
            throw  new ClienteSinTurnosException ("El historial del cliente esta vacio");
        }
        return historialDeTurnos;
    }

    // setter----------------------------------------------------------------
    public void setCategoria(Categoria categoria) {
        this.categoria = validacionCategoria(categoria);
    }

    // metodos lista------------------------------------------------
    public void agregarAlIstorialCliente(Turno turno) {
        historialDeTurnos.add(turno);
    }

    public Double costoTotalDeTurnos() {
        return historialDeTurnos.stream().mapToDouble(p -> p.importeTotal()).sum();
    }

    public Boolean historialVacio() {
        return historialDeTurnos.isEmpty();
    }

    // ----------------------------------------------------------------
    public Categoria validacionCategoria(Categoria categoria) {
        if (this.categoria instanceof Vip && historialVacio()) {
            throw new CategoriaNoAutorizadaException("El cliente no tiene historial.");
        }
        return categoria;
    }

}
