package org.mariorodriguez.models;

public class Desarrollador extends Empleado{
    private String lenguajeProgramación;

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProgramación, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajeProgramación = lenguajeProgramación;
    }

    public String getLenguajeProgramación() {
        return lenguajeProgramación;
    }

    public void setLenguajeProgramación(String lenguajeProgramación) {
        this.lenguajeProgramación = lenguajeProgramación;
    }
    
    @Override
    public void trabajar() {
        System.out.println(nombre + " está desarrollando en " + lenguajeProgramación + ".");
    }   
    
    public void trabajar(String proyecto) {
        System.out.println(nombre + " está trabajando en el proyecto " + proyecto + " usando " + lenguajeProgramación + ".");
    }
}