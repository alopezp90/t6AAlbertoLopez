package albertolopez;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Trabajador {

    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private boolean trabajando;

    public Trabajador() {
        this.nombre = "Juan Carlos Vico";
        this.dni = "12365478A";
        this.fechaNacimiento = LocalDate.of(2000,1,1);
        this.trabajando = false;
    }

    public Trabajador(String nombre, String dni, LocalDate fechaNacimiento, boolean trabajando) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.trabajando = trabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }

    @Override
    public String toString() {
        return "Trabajador:"
                + "\nNombre: " + nombre + "\tDNI: " + dni + "\tFecha de nacimiento: " + fechaNacimiento + "\tTrabajando: " + trabajando;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.dni);
        hash = 67 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 67 * hash + (this.trabajando ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        if (this.trabajando != other.trabajando) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }
}
