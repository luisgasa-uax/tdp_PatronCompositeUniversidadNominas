package es.uax.ginf.tecproc;

public class Main {
    public static void main(String[] args) {

        CompositeUniversidadNominas uni = new CompositeUniversidadNominas("UAX", 1);
        CompositeUniversidadNominas facInf = new CompositeUniversidadNominas("Fac. Informática", 0.1);
        uni.addHijo(facInf);

        CompositeUniversidadNominas  dptoDev = new CompositeUniversidadNominas("Departamento de Desarrollo", 0.2);
        facInf.addHijo(dptoDev);

        CompositeUniversidadNominas  dptoBBDD = new CompositeUniversidadNominas("Departamento de BBDD", 0.3);
        facInf.addHijo(dptoBBDD);

        ProfesorHojaUniversidadNominas ruben = new ProfesorHojaUniversidadNominas("Rubén", "123456", 100.0, 30);
        dptoDev.addHijo(ruben);

        ProfesorHojaUniversidadNominas antonio = new ProfesorHojaUniversidadNominas("Antonio", "987654", 200.0, 20);
        dptoBBDD.addHijo(antonio);

        System.out.println(uni.sumarNominas());

    }
}