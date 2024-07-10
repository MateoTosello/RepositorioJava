package entities;

public class Persona {

    private int dni;
    private String apellido;
    private String nombre;

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDefClase(){
        return "Persona";
    }

    //Constructor
    public Persona(){
        this(0,"Sabe","Nadie");
    }

    //Construcotor con parametros
    public Persona(int dni, String apellido, String nombre){
        //this(); Invoco al constructor Persona()
        this.setDni(dni);
        this.setApellido(apellido);
        this.setNombre(nombre);
    }

    public String getDetalle(){
        return this.getDetalle(false);
    }

    public String getDetalle( boolean mostrarDatosSensibles){
        String detalle = this.getDefClase() + " - ";
        if (mostrarDatosSensibles){
            detalle+=this.getDni()+": ";
        }
        detalle+=this.getApellido()+", "+getNombre();

        return detalle;
    }

}
