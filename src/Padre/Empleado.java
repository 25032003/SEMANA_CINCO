package Padre;

public class Empleado {
    private String nombre;
    private double sueldo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("homero")) {
            this.nombre = "No homero";
        } else
            this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.getNombre() +", sueldo: " + this.getSueldo();

    }

    @Override
    public String toString() {
        return "Su nombre es=" +this.getNombre() + " y su sueldo es=" + this.getSueldo();

    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;

    }
}
