import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Primer ejemplo");
        int n1;
        int n2=3;
        Integer n3;
        String texto;
        String texto2 = "hola";
        n1=2;

        n3 = n1+n2;

        Scanner lector = new Scanner(System.in);

        //variablesElIf(lector, n2, n1, texto2);
        iterar(lector);
        lector.close();

//        String despedida = JOptionPane.showInputDialog("Ingrese saludo final");
//        JOptionPane.showMessageDialog(null,despedida);

    }

    private static void iterar(Scanner lector){
        String[] palabras = new String[3];

        for (int i = 0; i < palabras.length; i++){
            System.out.println("Ingrese la palabra "+(i+1));
            palabras[i] = lector.nextLine();
        }

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("palabras["+i+"]: "+palabras[i]);
        }

        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.println("palabras["+i+"]: "+palabras[i]);
        }

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }
    private static void variablesElIf(Scanner lector, int n2, int n1, String texto2) {
        String texto;
        Integer n3;
        System.out.print("Ingrese un texto: ");
        texto = lector.nextLine();
        System.out.print("Ingrese un nro: ");
        n3 = Integer.parseInt(lector.nextLine());

        System.out.println("Texto: "+texto);
        System.out.println("Nro: "+n3);

        if(n3 == n2 + n1){
            System.out.println("Iguales");
        }else {
            System.out.println("Distintos");
        }

        //Compara dos objetos, compara que dos objetos tengan el mismo contenido
        if(texto.equals(texto2) ){
            System.out.println("Iguales");
        }else {
            System.out.println("Distintos");
        }
    }

}