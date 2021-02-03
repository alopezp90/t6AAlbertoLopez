package albertolopez;

import java.time.LocalDate;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class EspecialistaFontaneria extends Oficial {

    private int experiencia; //años

    public EspecialistaFontaneria() {
        super();
        this.experiencia = 0;
    }

    public EspecialistaFontaneria(String nombre, String dni, LocalDate fechaNacimiento, boolean trabajando,
            int categoria, boolean liderCuadrilla,
            int experiencia) {
        super(nombre, dni, fechaNacimiento, trabajando, categoria, liderCuadrilla);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.experiencia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final EspecialistaFontaneria other = (EspecialistaFontaneria) obj;
        if (this.experiencia != other.experiencia) {
            return false;
        }
        return true;
    }

    @Override
    public void darEPIs() {
        super.darEPIs();
        System.out.println("Escalera"
                + "\nMascarilla con filtro");
    }
}
