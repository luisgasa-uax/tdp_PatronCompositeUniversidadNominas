package es.uax.ginf.tecproc;

import java.util.ArrayList;
import java.util.List;

public class CompositeUniversidadNominas implements IComponentUniversidadNominas {
    private final List<IComponentUniversidadNominas> hijos;
    private final String nombre;
    private double complemento;

    public CompositeUniversidadNominas(String nombre, double complemento) {
        this.hijos = new ArrayList<>();
        this.nombre = nombre;
        this.complemento = complemento;
    }

    public void addHijo(IComponentUniversidadNominas hijo) {
        hijos.add(hijo);
    }

    public void removeHijo(IComponentUniversidadNominas hijo) {
        hijos.remove(hijo);
    }

    public List<IComponentUniversidadNominas> getHijos() {
        return this.hijos;
    }

    @Override
    public double sumarNominas() {
        double totalNominas = 0;
        for (IComponentUniversidadNominas hijo : hijos) {
            totalNominas += hijo.sumarNominas();
        }
        return totalNominas * (1 + complemento);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getComplemento() {
        return 0;
    }

    @Override
    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

}
