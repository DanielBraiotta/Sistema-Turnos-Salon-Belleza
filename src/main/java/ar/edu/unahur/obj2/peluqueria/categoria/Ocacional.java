package ar.edu.unahur.obj2.peluqueria.categoria;

import ar.edu.unahur.obj2.peluqueria.Turno;

public class Ocacional implements Categoria{

    @Override
    public Double importeTotal(Turno turno) {
        return turno.precioPorCantidad();
    }

}
