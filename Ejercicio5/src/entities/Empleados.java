package entities;

public abstract class Empleados {

    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private double sueldoBase;

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public Empleados(){}

    public Empleados( String nombre, String apellido, int dni, String email, double sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    public abstract double getSueldo();

}
