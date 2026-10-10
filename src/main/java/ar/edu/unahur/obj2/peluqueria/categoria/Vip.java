package ar.edu.unahur.obj2.peluqueria.categoria;

public class Vip implements Categoria {

    @Override
    public Double importeTotal(Double precioBase) {
        return precioBase * 0.8;
    }

}
