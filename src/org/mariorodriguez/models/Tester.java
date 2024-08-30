package org.mariorodriguez.models;

public class Tester extends Empleado{
    private String tipoPruebas;

    public Tester() {
    }
    
    public Tester(String tipoPruebas, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }
    
    @Override
    public void trabajar() {
        System.out.println(nombre + " está realizando pruebas de tipo " + tipoPruebas + ".");
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println(nombre + " está usando la herramienta " + herramienta + " para probar el proyecto " + proyecto + ".");
    }
    
    
}
