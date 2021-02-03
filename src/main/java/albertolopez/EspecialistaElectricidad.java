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

}
