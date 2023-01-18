/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    
    // método que permita preguntar al usuario la dirección de la empresa
    public static String obtenerTrabajo(){
    Scanner entrada = new Scanner(System.in);
    String trabajo;
        System.out.println("ingrese su lugar de trabajo:");
        trabajo = entrada.nextLine();
        return trabajo;
    }
    public static String obtenerUbicacion(){
    Scanner entrada = new Scanner(System.in);
    String ubicacionT;
        System.out.println("ingrese la direccion de su trabajo:");
        ubicacionT = entrada.nextLine();
        return ubicacionT;
    }
}
