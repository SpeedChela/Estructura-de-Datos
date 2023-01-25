/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SP-DR
 */
public class Ejercicio2_ArrayList
{

    public static void main(String[] args)
    {

        /* ArrayList<String> Lista = new ArrayList<>();
        
        //Agregar al final
        Lista.add("BLANCO");
        Lista.add("AZUL");
        System.out.println("Lista: "+Lista);
        //Agregar en poss
        Lista.add(1, "ROJO");
        System.out.println("Lista: "+Lista);
        //Eliminar
        Lista.remove("BLANCO");
        System.out.println("Lista: "+Lista);
        //Eliminar por pos
        Lista.remove(0);
        System.out.println("Lista: "+Lista);
        //Tamaño
        System.out.println("Tamaño: "+Lista.size());
        Lista.add("BLANCO");
        Lista.add("AZUL");
        //Obtiene pos de elemento
        System.out.println("Pos de elemento:"+Lista.indexOf("ROJO"));
        System.out.println("Lista: "+Lista);
        //Existe Elemento
        if (Lista.contains("BLANCO"))
        {
            System.out.println("Existe el blanco");
        }
        else
            System.out.println("No existe krnal, no andes de pregunton");
        //Obtener Elemento
            System.out.println("Elemento pos 1: "+Lista.get(1));*/
        int opc;

        do
        {
            System.out.println("Menu");
            System.out.println("------------------------------");
            System.out.println("1.- Ingreso de calificaciones y despliegue");
            System.out.println("2.- Salir");
            CalArraylist CAL = new CalArraylist();

            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();
            switch (opc)
            {
                case 1:
                    int n;
                    System.out.println("Cuantas calificaciones se agregaran?");
                    n = sc.nextInt();
                    CAL.Agregar(n);
                    System.out.println("///////////////////////////////////");
                    CAL.desplegar();
                    System.out.println("///////////////////////////////////");
                    CAL.conteo();
                    break;
                case 2:
                    System.out.println("Gracias por usar el programa :)");
                    break;
                default:
                    System.out.println("No existe esa opcion");
            }

        } while (opc != 2);

    }
}
