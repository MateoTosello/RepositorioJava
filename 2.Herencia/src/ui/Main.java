package ui;

import entities.Alumnos;
import entities.Persona;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        System.out.println(persona.getDetalle(true));

        persona.setDni(111111);
        persona.setApellido("Tosello");
        persona.setNombre("Mateo");

        System.out.println(persona.getDetalle(true));

        Persona persona1 = new Persona(222222,"Doe","John");

        System.out.println(persona1.getDetalle(true));

        Alumnos alumno = new Alumnos();

        System.out.println(alumno.getDetalle(true));

        Alumnos alumno2 = new Alumnos(1233,3333333, "Alumno","Ejemplar");

        System.out.println(alumno2.getDetalle());

        Persona alumno3 = new Alumnos();

        alumno3.setDni(444444);
        alumno3.setApellido("Algo");
        alumno3.setNombre("Extraño");
        ((Alumnos)alumno3).setLegajo(456);

        System.out.println(alumno3.getDetalle(true));

    }
}