package ar.edu.unahur.obj2.peluqueria.categoria;

import ar.edu.unahur.obj2.peluqueria.Turno;

public class Vip implements Categoria {

    @Override
    public Double importeTotal(Turno turno) {
        return turno.precioPorCantidad() * 0.2;
    }

}
