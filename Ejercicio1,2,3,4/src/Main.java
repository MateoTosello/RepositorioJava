import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ej 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i%2 != 0){
                System.out.println(i);
            }
        }

        //Ej 2

        String[] array = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra "+ i+1 +": ");
            Scanner lector = new Scanner(System.in);
            array[i] = lector.nextLine();
        }
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Ingrese la palabra a comparar: ");
        Scanner lector = new Scanner(System.in);
        String palabra = lector.nextLine();
        //Ej 3
        for (int i = 0; i < 10; i++) {
            if (array[i].equals(palabra)){
                System.out.println("Coinciden");
                break;
            }
        }

        //Ej 4
        int[] arrayNumeros = new int[10];
        int cont = 0;
        System.out.println("Ingrese un nro");
        Integer numero = Integer.parseInt(lector.nextLine());

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nro"+ (i+1) +": ");
            Integer numero2 = Integer.parseInt(lector.nextLine());
            if (numero2>numero){
                arrayNumeros[cont] = numero2;
                cont++;
            }
        }

        for (int i = 0; i < cont; i++) {
            System.out.println(arrayNumeros[i]);
        }

    }
}