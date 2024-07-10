package exercises;

import entities.Administrativo;
import entities.Empleados;
import entities.Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args){

        boolean band = true;
        String nombre, apellido, mail, opc;
        int dni, hsExtra, hsMes, totalVentas;
        double sueldoBase, porcenComision;
        Scanner lector = new Scanner(System.in);
        ArrayList<Empleados> empleados = new ArrayList<>();

        while(band){
            System.out.println("**Nuevo empleado**");
            System.out.println("Ingrese nombre: ");
            nombre = lector.nextLine();
            System.out.println("Ingrese apellido: ");
            apellido = lector.nextLine();
            System.out.println("Ingrese dni: ");
            dni = Integer.parseInt(lector.nextLine());
            System.out.println("Ingrese mail: ");
            mail  = lector.nextLine();
            System.out.println("Ingrese sueldo base: ");
            sueldoBase = Double.parseDouble(lector.nextLine());

            System.out.println("Ingrese que tipo de empleado es: ");
            System.out.println("A-Administrativo, V-Vendedor");
            if((lector.nextLine()).toLowerCase().equals("a")){
                System.out.println("Estamos en admin");
                System.out.println("Ingrese hs extra: ");
                hsExtra = Integer.parseInt(lector.nextLine());
                System.out.println("Ingrese hs mes: ");
                hsMes = Integer.parseInt(lector.nextLine());
                Administrativo admin = new Administrativo(nombre,apellido,dni,mail,sueldoBase,hsExtra,hsMes);
                empleados.add(admin);
            }else {
                System.out.println("Ingrese porcentaje comision: ");
                porcenComision = Double.parseDouble(lector.nextLine());
                System.out.println("Ingrese total ventas: ");
                totalVentas = Integer.parseInt(lector.nextLine());
                Vendedor vendedor = new Vendedor(nombre,apellido,dni,mail,sueldoBase,porcenComision,totalVentas);
                empleados.add(vendedor);
            }
            System.out.println("Quiere ingresar otro empleado?");
            System.out.println("S-Si, N-No");
            opc = lector.nextLine();
            if (opc.toLowerCase().equals("n")){
                band = false;
            }
        }

        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("DNI: "+ empleados.get(i).getDni());
            System.out.println("Apellido: "+ empleados.get(i).getApellido());
            System.out.println("Nombre: "+ empleados.get(i).getNombre());
            if(empleados.get(i).getClass().equals(Administrativo.class)){
                System.out.println("Sueldo: "+(empleados.get(i).getSueldo()));
            }else{
                System.out.println("Sueldo: "+(empleados.get(i).getSueldo()));
            }

        }


        lector.close();


    }

}
