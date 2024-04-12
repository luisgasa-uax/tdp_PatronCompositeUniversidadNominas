package es.uax.ginf.tecproc;

public class ProfesorHojaUniversidadNominas implements IComponentUniversidadNominas {

    private final String nombre;
    private final String np;
    private double precioHora;
    private int horasTrabajo;

    public ProfesorHojaUniversidadNominas(String nombre, String np, double precioHora, int horasTrabajo) {
        this.nombre = nombre;
        this.np = np;
        this.precioHora = precioHora;
        this.horasTrabajo = horasTrabajo;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public double sumarNominas() {
        return this.horasTrabajo * this.precioHora;
    }
}
