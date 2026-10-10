package ar.edu.unahur.obj2.peluqueria.categoria;

public class Ocacional implements Categoria{

    @Override
    public Double importeTotal(Double precioBase) {
        return precioBase;
    }

}
