package albertolopez;

import java.time.LocalDate;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Oficial extends Trabajador{
    
    private int categoria;
    private boolean liderCuadrilla;

    public Oficial() {
        super();
        this.categoria = 1;
        this.liderCuadrilla = false;
    }

    public Oficial(String nombre, String dni, LocalDate fechaNacimiento, boolean trabajando, int categoria, boolean liderCuadrilla) {
        super(nombre, dni, fechaNacimiento, trabajando);
        this.categoria = categoria;
        this.liderCuadrilla = liderCuadrilla;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public boolean isLiderCuadrilla() {
        return liderCuadrilla;
    }

    public void setLiderCuadrilla(boolean liderCuadrilla) {
        this.liderCuadrilla = liderCuadrilla;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.categoria;
        hash = 23 * hash + (this.liderCuadrilla ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) {
            return false;
        }
        final Oficial other = (Oficial) obj;
        if (this.categoria != other.categoria) {
            return false;
        }
        if (this.liderCuadrilla != other.liderCuadrilla) {
            return false;
        }
        return true;
    }
}
