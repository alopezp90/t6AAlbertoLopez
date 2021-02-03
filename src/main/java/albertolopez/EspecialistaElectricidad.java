package albertolopez;

import java.time.LocalDate;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class EspecialistaElectricidad extends Oficial {
    
    private boolean tieneCursoFormacion;
    
    public EspecialistaElectricidad() {
        super();
        this.tieneCursoFormacion = false;
    }
    
    public EspecialistaElectricidad(String nombre, String dni, LocalDate fechaNacimiento, boolean trabajando, 
            int categoria, boolean liderCuadrilla, 
            boolean tieneCursoFormacion) {
        super(nombre, dni, fechaNacimiento, trabajando, categoria, liderCuadrilla);
        this.tieneCursoFormacion = tieneCursoFormacion;
    }

    public boolean isTieneCursoFormacion() {
        return tieneCursoFormacion;
    }

    public void setTieneCursoFormacion(boolean tieneCursoFormacion) {
        this.tieneCursoFormacion = tieneCursoFormacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.tieneCursoFormacion ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final EspecialistaElectricidad other = (EspecialistaElectricidad) obj;
        if (this.tieneCursoFormacion != other.tieneCursoFormacion) {
            return false;
        }
        return true;
    }
    
    @Override
    public void darEPIs() {
        super.darEPIs();
        System.out.println("Guantes de goma"
                + "\nCalzado antiestatico");
    }
}
