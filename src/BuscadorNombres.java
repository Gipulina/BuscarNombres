import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BuscadorNombres {

    public static void main(String[] args) {
        String lista, nom;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar una lista de nombres");
        lista = sc.nextLine();
        lista = lista.toLowerCase();
        System.out.println("Introduce nombre a buscar");
        nom = sc.nextLine();
        String[]nombres; // array.
        nombres = lista.split(",");
        //recorremos el array
        for(String nombre:nombres){
            if(nombre.equals(nom)){
                contador++;
            }
        }
        System.out.println("El nombre aparece " + contador + " veces");
    }
}