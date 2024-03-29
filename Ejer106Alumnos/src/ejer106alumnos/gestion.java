
package ejer106alumnos;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class gestion {
    static void aniadirAlumno(Map<String,String> datos){
         /*
    aniadirAlumno(String nombre, String ciudad): almacena el par nombre-ciudad en
    la estructura. Si existe ya un alumno con ese nombre, se indica por pantalla y no se almacena nada.
    */
         Scanner sc =new Scanner(System.in);
         String nombre,ciudad = null;
        
         int eleccion=0;
         
         do {

System.out.println("Seleccione una opción:\n" +
                   "1: añadir alumno\n" +
                   "2: salir\n" +
                   "3: mostrar alumnos\n" +
                   "4: mostrar ciudad\n" +
                   "5: cantidadCiudades\n" +
                   "6: mostrar\n" +
                   "7: Borrar");             eleccion=sc.nextInt(); //la eleccion en el do-while
             
            switch (eleccion){
             case 1:
                  System.out.println("introduce nombre del alumno");
        nombre= sc.next();
        if (datos.containsKey(nombre)) {
                     System.out.println("El alumno :"+ nombre+"ya existe");
                     break;
                 }
                 System.out.println("introduce la ciudad");
                 ciudad=sc.next();
                  datos.put(nombre, ciudad);
                 break;
                 case 2:
                     System.out.println("saliendo del programa");
            break;
                 case 3:
                    mostrarDatos(datos);
                     break;
                 case 4:
                     mostrarCiudad(datos);
                     break;
                 case 5:
                     cantidadCiudades(datos);
                     break;
                 case 6:
                     mostrarDatos(datos);
                     break;
                 case 7:
                     borrar(datos);
                     
                     break;
                     
            default:
                    System.out.println("Opción no válida. Introduce 1 para añadir alumno o 2 para salir.");
                    break;
         }  
        } while (eleccion!=2);
                

        
         
    }
    static void mostrarCiudad(Map<String,String>datos){
         Scanner sc =new Scanner(System.in);
        /*
        mostrarCiudad(String ciudad): Si se encuentra en la estructura, muestra la ciudad 
        que se le pasa como parámetro y el número de alumnos que han nacido en ella.
        */
        System.out.println("introduce la ciudad a comprobar");
         String ciudad=sc.next();
        int contador=0;
        if (datos.containsValue(ciudad)) {
             System.out.println("-----"+ciudad+"------");
             for (Map.Entry<String,String> entry: datos.entrySet()){
            if (entry.getValue().equalsIgnoreCase(ciudad)) {
                contador ++;
               
                
            }else {
            System.out.println("ciudad no encontrada");
        }
            
        }
             System.out.println("numero de alumnos que nacieron aqui:"+ contador);
        }
         
    }

    private static void cantidadCiudades(Map<String, String> datos) {

/*
        cantidadCiudades(): devuelve el número de ciudades distintas 
        que hay en la estructura.
        SIMPLEMENTE METEMOS EN UN CONNJUNTO HASHSET las ciudades y como no admite
        repeticiones, nos dara el numero de ciudades distintas.
        
        */        
       Set <String> cantidadCiudades =new HashSet<>();
        for(String ciudad:datos.values()){
            cantidadCiudades.add(ciudad);
        }
        System.out.println("Ciudades:------"+cantidadCiudades.size());
    }

    private static void mostrarDatos(Map<String, String> datos) {
 System.out.println("---ALUMNOS---");
                     for (Map.Entry<String,String> entry:datos.entrySet()){
                         System.out.println("Nombre alumno: "+entry.getKey()+"Ciudad:  "+entry.getValue());
                         
                     }
    }

    private static void borrar(Map<String, String> datos) {
        System.out.println("introduce al alumno para eliminar");
        Scanner sc=new Scanner(System.in);
        String alumnoBorrar=sc.next();
        
        if (datos.containsKey(alumnoBorrar)) {
                     System.out.println("El alumno :"+ alumnoBorrar+"ha sido eliminado");
                     datos.remove(alumnoBorrar);
                 }else{
            System.out.println("no se ha encontrado alumno con el nombre:" +alumnoBorrar);
        }
        
    }
   
}
