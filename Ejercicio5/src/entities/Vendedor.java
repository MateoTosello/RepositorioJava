package entities;

public class Vendedor extends Empleados{

    private double porcenComision;
    private int totalVentas;

    public double getPorcenComision() {
        return porcenComision;
    }

    public void setPorcenComision(double porcenComision) {
        this.porcenComision = porcenComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Vendedor(String nombre, String apellido, int dni, String email, double sueldoBase, double porcenComision, int totalVentas) {
        super(nombre, apellido, dni, email, sueldoBase);
        this.porcenComision = porcenComision;
        this.totalVentas = totalVentas;
    }

    @Override
    public double getSueldo() {
        return getSueldoBase()+(this.porcenComision*this.totalVentas/100);
    }
}
