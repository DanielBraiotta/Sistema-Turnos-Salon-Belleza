package ar.edu.unahur.obj2.peluqueria.servicio;

public class Coloracion extends Servicio{
    private Integer numero =1;
    public Coloracion(Double precioBase, Integer cantidadCupos) {
        super(precioBase, cantidadCupos);

    }

    @Override
    public String emiteComprobante() {
        return "TRN-COL-" + numero++;
    }

    @Override
    public void registrarAviso() {
        System.out.println("Aviso: Retoque dentro de 30 días");
    }
    

}
