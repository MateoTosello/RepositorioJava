package entities;

public class Alumnos extends Persona{

    private int legajo;



    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumnos(){
        this.setLegajo(49475);
    }

    public Alumnos( int legajo, int dni, String apellido, String nombre){
        super(dni, apellido, nombre);
        this.setLegajo(legajo);
    }

    @Override
    public String getDetalle(boolean mostrarDatosSensibles){
        return super.getDetalle(mostrarDatosSensibles)+" - "+this.getLegajo();
    }

    @Override
    public String getDefClase(){
        return "Alumno";
    }
}
