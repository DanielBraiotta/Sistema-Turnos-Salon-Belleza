package ar.edu.unahur.obj2.peluqueria.servicio;

import ar.edu.unahur.obj2.peluqueria.categoria.Categoria;
import ar.edu.unahur.obj2.peluqueria.excepciones.PrecioNegativoException;

public abstract class Servicio {
    //atribuots-------------------------------------
    private Double precioBase;
    private Integer cantidadCupos;
    
    //constructor------------------
    public Servicio(Double precioBase, Integer cantidadCupos) {
        this.precioBase = validarPrecioBase(precioBase);
        this.cantidadCupos = cantidadCupos;
    }
    
    //getters------------------------------------
    public Double getPrecioBase() {
        return precioBase;
    }

    public Integer getCantidadCupos() {
        return cantidadCupos;
    }

    //metodos----------------
    public Double validarPrecioBase(Double precioBase){
        if(precioBase < 0){
            throw new PrecioNegativoException ("El precio no debe ser negativo.");
        }
        return precioBase;
    }

    public void restarCantidadDeCupos(Integer cantidad){
        this.cantidadCupos -= cantidad;
    }
    //abstract
    public abstract String emiteComprobante();

    public void registrarAviso(){};
    /*
    calcular importe
    comprobante 1/2/3
    cambiar a confirmado
    
    abiso
    reserva

    cantidad--
    
    */



}
