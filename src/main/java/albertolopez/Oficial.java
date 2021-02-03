package albertolopez;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Oficial {
    
    private int categoria;
    private boolean liderCuadrilla;

    public Oficial() {
        this.categoria = 1;
        this.liderCuadrilla = false;
    }

    public Oficial(int categoria, boolean liderCuadrilla) {
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
