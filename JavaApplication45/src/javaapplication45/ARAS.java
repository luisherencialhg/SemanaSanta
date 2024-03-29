/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication45;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Luis
 */
public class ARAS {
     static void borrar(Map <String,String> datos,String clave) {
        
        if (datos.containsKey(clave)) {
            datos.remove(clave);
            System.out.println("Elemento eliminado: Clave= "+clave);
            
            
        } else{
            System.out.println("la clave especificada no existe en el diccionario");
        }
    }
    

     static void meter(Map <String,String> datos,String clave,String valor) {
      /*
         -meter(String clave,String valor): introduce una nueva celda en el diccionario con la clave y el valor indicados. Si ya 
        existe una celda con esa clave, lo indica por pantalla y no toca el diccionario.
        */
        if (datos.containsKey(clave)) {
            System.out.println("la clave "+clave+"ya se encuentra en el diccionario");
            
        } else{
            datos.put(clave, valor);
            System.out.println("clave"+clave+" y valor"+valor+"añadidos");
        }
    }

     static void actualizar(Map<String, String> datos, String clave, String valor) {
    /*
    - actualizar(String clave, String valor): busca la celda indicada por la clave y cambia su valor.
    Si la celda no existe, lo indica por pantalla.
    */
    if (datos.containsKey(clave)) {
        datos.put(clave, valor);
       
        System.out.println("Valor actualizado para la clave " + clave);
    } else {
        System.out.println("La clave especificada no existe en el diccionario.");
    }
}


     static boolean existeClave(Map <String,String> datos,String clave) {
      /*
         -existeClave(String clave): devuelve verdadero o falso dependiendo de si existe o no la celda que indica la clave que 
        se pasa en el argumento.
        */
        return datos.containsKey(clave);
    }

     static boolean existeValor(Map <String,String> datos,String valor) {
      /*
         - existeValor(String valor): devuelve verdadero o falso dependiendo de si existe o no alguna celda con el valor que 
        se pasa en el argumento.
        */
      return datos.containsValue(valor);
    }

     static String primerValor(Map <String,String> datos,String valor) {
      /*
        -primerValor(String valor): devuelve la clave de la primera celda que tenga el valor pasado como parámetro. Si no existe 
        ninguna clave, devolverá la cadena “undefined”.
        */
        /*
      RESOLVER CON UN BUBLE FOR:EACH
      */
        for (Map.Entry<String,String> entry: datos.entrySet()){
            if (entry.getValue().equalsIgnoreCase(valor)) {
                
                entry.getKey();
            } 
        }
        return "undefined";
    }

    static void mostrar(Map <String,String> datos) {
      /*
         -mostrar(diccionario): muestra el diccionario con sus pares en columna y ordenados por clave.
        PODEMOS CONVERTIR EL DICCIONARIO EN UN TREEMAP Y SE ORDENA DE FORMA AUTOMATICA EN EL 
        ORDEN NATURAL DE LAS CLAVES Y LUEGO UN FOR EACH
        */
        Map<String,String> diccionarioOrdenado=new TreeMap <>(datos);
        for(Map.Entry<String,String> entry:datos.entrySet()){
            System.out.println("clave: "+entry.getKey()+" valor: "+entry.getValue());
        }
    }
    
}
