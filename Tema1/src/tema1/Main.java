/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author SP-DR
 */
public class Main
{
   
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n;
        System.out.println("Cuantas calificaciones vas a poner?");
        n=num.nextInt();
        Calificacion cal= new Calificacion(n);
        cal.lectura();
        System.out.println("//////////////////////////////////////////");
        cal.desplegar();
        System.out.println("//////////////////////////////////////////");
        cal.conteo();
    }
}
