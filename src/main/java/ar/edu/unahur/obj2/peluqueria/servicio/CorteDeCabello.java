package ar.edu.unahur.obj2.peluqueria.servicio;

public class CorteDeCabello extends Servicio {
    private Integer numero = 1;
    public CorteDeCabello(Double precioBase, Integer cantidadCupos) {
        super(precioBase, cantidadCupos);

    }

    @Override
    public String emiteComprobante() {
        return "TRN-COR-" + numero++;
    }
}
