package ar.edu.unahur.obj2.peluqueria.servicio;

public class TratamientoCapilar extends Servicio {
    private Integer numero = 1;
    public TratamientoCapilar(Double precioBase, Integer cantidadCupos) {
        super(precioBase, cantidadCupos);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String emiteComprobante() {
        return "TRN-TRA-" + numero++;
    }

}
