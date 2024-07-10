package entities;


public class Administrativo extends Empleados{

    private int hsExtra;
    private int hsMes;

    public int getHsExtra() {
        return hsExtra;
    }

    public void setHsExtra(int hsExtra) {
        this.hsExtra = hsExtra;
    }

    public int getHsMes() {
        return hsMes;
    }

    public void setHsMes(int hsMes) {
        this.hsMes = hsMes;
    }

    public Administrativo(String nombre, String apellido, int dni, String mail, double sueldoBase, int hsExtra, int hsMes){
        super(nombre,apellido, dni, mail, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    @Override
    public double getSueldo(){
        return getSueldoBase()*((hsExtra*1.5)+hsMes)/hsMes;
    }

}
