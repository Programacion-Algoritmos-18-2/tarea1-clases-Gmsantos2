package Ejercicio1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerson
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // importamos el metodo scanner
        //Declaración de variables globales
        String nombre;
        int edad;
        int cedula;
        int cont = 0;
        Estudiante[] lista = new Estudiante[2];
        // ingreso de datos
        do {
            Estudiante e = new Estudiante();
            cont = cont + 1;
            System.out.printf("Estudiante #%d\n", cont);
            System.out.printf("Nombre:\n");
            nombre = entrada.nextLine();
            System.out.printf("Edad:\n");
            edad = entrada.nextInt();
            entrada.nextLine();

            //enviar variables a clase Estudiante
            e.nombr = nombre;
            e.e = edad;
            lista[cont - 1] = e;
        } while (cont < 2);
        // salida de datos
        System.out.println("----Datos----\n");
        System.out.printf("%s\t\t%s\n", "Nombre", "Edad");
        for(int i = 0; i < lista.length; i++) {
            System.out.printf("%s\t\t%s\n", lista[i].nombr, lista[i].e);
        }

    }
}
