/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg108trespartes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Departamento {
    //atributos
   private Map<Integer,Empleado> empleados;
   /*
   //como atributo es una Map al que le pasamos como argumento
   el dni y un empleado
   */
   //constructor
   
    
   //Constructor con el unico atributo
    public Departamento() {
        this.empleados=new HashMap<>();
        //los empleados los introducimos en un hashMap con valores clave-valor
        
    }
   
  //METODOS:
    public void aniadirEmpleado(){
        System.out.println("introduce el dni del empleado");
        Scanner sc=new Scanner(System.in);
         int dni=sc.nextInt();
         if (empleados.containsKey(dni)) {
             System.out.println("empleado existente");
            return;
        }
         System.out.println("introduce nombre, apellido y sexo");
         String nombre =sc.next(),apellido =sc.next(),sexo=sc.next();
         empleados.put(dni, new Empleado(nombre,apellido,sexo));
         System.out.println("empleado guardado");
       
        
    }
    
    public void borrarEmpleado(){
        System.out.println("introduce dni Empleado a eliminar");
           Scanner sc=new Scanner(System.in);
         int dni=sc.nextInt();
         if (empleados.containsKey(dni)) {
             
            empleados.remove(dni);
             System.out.println("empleado eliminado:\n"+dni);
            
        }else{
             System.out.println("no se ha encontrado al empleado");
         }
             
    }
    
    public void buscarEmpleado(){
        System.out.println("introducir dni empleado");
           Scanner sc=new Scanner(System.in);
         int dni=sc.nextInt();
         if (empleados.containsKey(dni)) {
             Empleado empleado=empleados.get(dni);
               System.out.println(empleado.toString());
               
             
            
        }else{
             System.out.println("no se ha encontrado al empleado");
         }
    }
    public void revisarSueldos(){
        for(Empleado empleado:empleados.values()){
            if (empleado.getAntiguedad()>=6&&empleado.getAntiguedad()<=8) {
                empleado.setSueldoBase(empleado.getSueldoBase()+500);
                
            }
             if (empleado.getAntiguedad()>=2&&empleado.getAntiguedad()<=4) {
                empleado.setSueldoBase(empleado.getSueldoBase()+200);
                
            }
              if (empleado.getAntiguedad()>=9&&empleado.getAntiguedad()<=10) {
                empleado.setSueldoBase(empleado.getSueldoBase()+750);
                
            } if (empleado.getAntiguedad()>10) {
                empleado.setSueldoBase(empleado.getSueldoBase()+900);
                
            }
        }
    }
    
    public void nuevoAnio(){
        for(Empleado empleado:empleados.values()){
            //System.out.println(empleados.keySet());
            empleado.setAntiguedad(empleado.getAntiguedad()+1);
        }
    }
    public void mostrarDepartamento(){
        System.out.println("----DEPARTAMENTO----");
        for(Integer empleado:empleados.keySet()){
            System.out.println(" DNI:" + empleado);
        }
    }

    @Override
    public String toString() {
        return "Departamento{" + "empleados=" + empleados + '}';
    }
    
}
