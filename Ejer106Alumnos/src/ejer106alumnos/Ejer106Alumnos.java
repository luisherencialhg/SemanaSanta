package ejer106alumnos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejer106Alumnos {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Map<String, String> alumnos = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("¿Qué quieres hacer? 1: gestión de alumnos, 2: mostrar ciudades");
    int opcion = sc.nextInt();
    sc.nextLine(); // Consumir la línea en blanco después del número
    
    if (opcion == 1) {
        gestion.aniadirAlumno(alumnos);
    }
    gestion.mostrarCiudad(alumnos);
}


}
