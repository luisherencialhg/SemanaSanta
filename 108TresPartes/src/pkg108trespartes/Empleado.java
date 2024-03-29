/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg108trespartes;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Luis
 */
public class Empleado {
    //Atributos
    private String nombre;
    private String apellido;
    private String sexo;
    private double sueldoBase=800;
    private int antiguedad;
    
    public Empleado(String nombre, String apellido, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.antiguedad= antiguedadAleatoria();
        
    }
    private int antiguedadAleatoria() {
       int antiguedad= (int)(Math.random()*11);
     return antiguedad; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.sexo, other.sexo);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", sueldoBase=" + sueldoBase + ", antiguedad=" + antiguedad + '}';
    }

    
    
    
}
