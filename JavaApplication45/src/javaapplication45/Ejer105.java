package javaapplication45;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis
 */
public class Ejer105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Crea la clase ARAS la cual facilitará el trabajo con diccionarios de tipo 
        String-String. Para ello es necesario implementar los siguientes métodos:
        - borrar(String clave): elimina la celda indicada por la clave.
        -meter(String clave,String valor): introduce una nueva celda en el diccionario con la clave y el valor indicados. Si ya 
        existe una celda con esa clave, lo indica por pantalla y no toca el diccionario.
        -actualizar(String clave,String valor): busca la celda indicada por la clave y cambia su valor. Si la celda no existe,
        lo indica por pantalla.
        -existeClave(String clave): devuelve verdadero o falso dependiendo de si existe o no la celda que indica la clave que 
        se pasa en el argumento.
        - existeValor(String valor): devuelve verdadero o falso dependiendo de si existe o no alguna celda con el valor que 
        se pasa en el argumento.
        -primerValor(String valor): devuelve la clave de la primera celda que tenga el valor pasado como parámetro. Si no existe 
        ninguna clave, devolverá la cadena “undefined”.
        -mostrar(diccionario): muestra el diccionario con sus pares en columna y ordenados por clave.
        Clave: ………  Valor: ………

Clave: ………  Valor: ………

Clave: ………  Valor: ………

Clave: ………  Valor: ………
         */
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Emilio", "gutierrez");
        diccionario.put("Luis", "antonio");
        diccionario.put("yaleh", "velazquez");
        diccionario.put("Paco", "Zaragoza");
        diccionario.put("Miguel", "villalba");
        diccionario.put("Carlos", "gutamar");
        ARAS aras =new ARAS ();
        ARAS.mostrar(diccionario);
      ARAS.mostrar(diccionario);
      ARAS.borrar(diccionario, "Emilio");
         ARAS.mostrar(diccionario);

    }

   

}
