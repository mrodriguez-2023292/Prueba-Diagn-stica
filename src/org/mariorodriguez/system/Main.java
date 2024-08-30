package org.mariorodriguez.system;

import java.util.Scanner;
import org.mariorodriguez.models.Desarrollador;
import org.mariorodriguez.models.Empleado;
import org.mariorodriguez.models.Tester;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Desarrollador desarrollador = new Desarrollador("Java", "Luis", 25, 3154.21);
        Tester tester = new Tester("funcional", "Marco", 23, 4561.14);
        Empleado empleado1 = new Desarrollador("Java", "Luis", 25, 3154.21);
        Empleado empleado2 = new Tester("funcional", "Marco", 23, 4561.14);
        boolean flag = true;
        
        while(flag == true){
            System.out.println("----------------------");
            System.out.println("Bienvenido al programa");
            System.out.println("----------------------");
            System.out.println("- Por favor escriba:");
            System.out.println("(1) Iniciar ");
            System.out.println("(2) Salir");
            System.out.println("");
            System.out.print(">");
            int opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("");
                    System.out.println("-------------------");
                    System.out.println("Clase Desarrollador");
                    System.out.println("-------------------");
                    System.out.println("");
                    System.out.print("-(1) Instancia directa: ");
                    desarrollador.trabajar();
                    System.out.println("");
                    System.out.print("-(2) Instancia directa: ");
                    desarrollador.trabajar("gestión de hoteles");
                    System.out.println("");

                    System.out.println("------------");
                    System.out.println("Clase Tester");
                    System.out.println("------------");
                    System.out.println("");
                    System.out.print("-(1) Instancia directa: ");
                    tester.trabajar();
                    System.out.println("");
                    System.out.print("-(2) Instancia directa: ");
                    tester.trabajar("Visual Studio", "gestión de hospital");
                    System.out.println("");

                    System.out.println("----------------------------");
                    System.out.println("Polimorfismo por sustitución");
                    System.out.println("----------------------------");
                    System.out.println("");

                    System.out.print("-(1) Polimorfismo por sustitución: ");
                    empleado1.trabajar();
                    System.out.println("");

                    System.out.print("-(2) Polimorfismo por sustitución: ");
                    empleado2.trabajar();
                    System.out.println("");

                    System.out.print("-(3) Polimorfismo por sustitución con sobrecarga: ");
                    empleado1.trabajar(8);
                    System.out.println("");

                    System.out.print("-(4) Polimorfismo por sustitución con sobrecarga: ");
                    empleado2.trabajar(10);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Has salido exitosamente del programa");
                    flag = false;
                    break;
                default:
                    System.out.println("");   
                    System.out.println("- No es una opcion");
                    System.out.println("");
            }
        }
    }
}


