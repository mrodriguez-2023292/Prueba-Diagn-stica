package org.mariorodriguez.models;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public abstract void trabajar();
    
    public void trabajar(int horas){
    }
}
