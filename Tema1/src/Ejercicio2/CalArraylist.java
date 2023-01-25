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
public class CalArraylist
{

    ArrayList<Integer> cal = new ArrayList<>();
    ArrayList<Integer> aux = new ArrayList<>();
    Scanner obj = new Scanner(System.in);

    public CalArraylist()
    {

    }

    public void Agregar(int n)
    {
        int x=0;
        int aux;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Ingresa la calificacion num : "+(i+1));
            aux = obj.nextInt();
            do
            {
                if (aux <0 || aux>100)
                {
                    System.out.println("Calificacion fuera del rango, ingrese nuevamente"); 
                    aux = obj.nextInt();
                }
                else{
                    x=1;
                }
            
            } while (x!=1);
            cal.add(aux);

        }

    }

    public void desplegar()
    {
        System.out.println("Lista de calificaciones");
        for (int i = 0; i < cal.size(); i++)
        {
            System.out.println("Calificaciones: "+cal.get(i));
        }

    }

    public void conteo()
    {
        //ArrayList<Integer> aux = new ArrayList<>();
        for (int i = 0; i < 7; i++)
        {
            aux.add(0);
        }
        for (int i = 0; i < cal.size(); i++)
        {
            if (cal.get(i) <= 49)
            {
                aux.set(0, aux.get(0)+1);
            } else if (cal.get(i) <= 59)
            {
                aux.set(1, aux.get(1)+1);
            } else if (cal.get(i) >= 69)
            {
                aux.set(2, aux.get(2)+1);
            } else if (cal.get(i) <= 79)
            {
                aux.set(3, aux.get(3)+1);
            } else if (cal.get(i) <= 89)
            {
                aux.set(4, aux.get(4)+1);
            } else if (cal.get(i) <= 99)
            {
                aux.set(5, aux.get(5)+1);
            } else if (cal.get(i) == 100)
            {
                aux.set(6, aux.get(6)+1);
            }
        }
        grafica(aux);
    }

    public void grafica(ArrayList<Integer> aux2)
    {
        
        System.out.println("0 a 40: "+pintaLinea(aux2.get(0)));
        System.out.println("50 a 59: "+pintaLinea(aux2.get(1)));
        System.out.println("60 a 69: "+pintaLinea(aux2.get(2)));
        System.out.println("70 a 79: "+pintaLinea(aux2.get(3)));
        System.out.println("80 a 89: "+pintaLinea(aux2.get(4)));
        System.out.println("90 a 99: "+pintaLinea(aux2.get(5)));
        System.out.println("100: "+pintaLinea(aux2.get(6)));
    }
    
    public String pintaLinea(int n){
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s+="*";
        }
        return s;
    }
}
