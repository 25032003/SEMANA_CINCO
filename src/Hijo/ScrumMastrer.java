package Hijo;

import Padre.Empleado;

public class ScrumMastrer extends Empleado {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ScrumMastrer(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles(){
        return "Desde hijo nombre:" + this.getNombre() + " sueldo: "
                + this.getSueldo() + "departamento:" + this.getDepartamento();


    }
}
