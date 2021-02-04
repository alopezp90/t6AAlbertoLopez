package albertolopez;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Prueba {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Paco Aguilar", "12345678A", LocalDate.of(1984, 4, 5), true);
        Trabajador t2 = new Trabajador("Jose Carlos Fernandez", "45637232E", LocalDate.of(1992, Month.MARCH, 6), true);

        Oficial o1 = new Oficial("Alvaro Diaz", "83726236T", LocalDate.of(1978, 5, 13), true, 1, true);
        Oficial o2 = new Oficial("Alejandro Puertas", "76342534P", LocalDate.of(2000, 1, 23), true, 2, false);

        EspecialistaElectricidad e1 = new EspecialistaElectricidad("Felipe Osorio", "23432298H", LocalDate.of(1990, 9, 10), true, 1, true, true);
        EspecialistaElectricidad e2 = new EspecialistaElectricidad("Jeronimo Gutierrez", "23442542X", LocalDate.of(1986, 4, 1), true, 2, false, false);

        EspecialistaFontaneria f1 = new EspecialistaFontaneria("Fermin Trujillo", "08638394F", LocalDate.of(1978, 2, 17), true, 1, true, 15);
        EspecialistaFontaneria f2 = new EspecialistaFontaneria("Tomas Hernandez", "76254393Y", LocalDate.of(1997, 12, 6), false, 2, false, 1);

        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        trabajadores.add(t1);
        trabajadores.add(t2);

        //Conversiones implicitas
        trabajadores.add(o1);
        trabajadores.add(o2);

        trabajadores.add(e1);
        trabajadores.add(e2);

        trabajadores.add(f1);
        trabajadores.add(f2);

        for (Trabajador trabajador : trabajadores) {
            trabajador.darEPIs();
            if (trabajador instanceof Oficial) {
                //conversion explicita
                ((Oficial) trabajador).ascender();
            }
            if (trabajador instanceof EspecialistaElectricidad) {
                //conversion explicita
                ((EspecialistaElectricidad) trabajador).esMalDiaParaUnChispazo();
            }
            if (trabajador instanceof EspecialistaFontaneria) {
                //conversion explicita
                ((EspecialistaFontaneria) trabajador).compruebaExperiencia();
            }
        }

        if (trabajadores.contains(e2)) {
            trabajadores.remove(trabajadores.indexOf(e2));
        }
    }
}
