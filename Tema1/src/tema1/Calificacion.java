/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calificacion
{

    private int Cal[];

    public Calificacion(int N)
    {
        Cal = new int[N];
    }

    public void lectura()
    {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < Cal.length; i++)
        {
            System.out.println("ingresa la calificacion num "+(i+1));
            Cal[i] = leer.nextInt();
        }
    }

    public void desplegar()
    {
        System.out.println("Lista de calificaciones");
        for (int i = 0; i < Cal.length; i++)
        {
            System.out.println((i+1) + ".-   -->" + Cal[i]);
        }
    }

    public void conteo()
    {
        int Aux[] = new int[7];
        for (int i = 0; i < Cal.length; i++)
        {
            if (Cal[i] <= 49)
            {
                Aux[0]++;
            } else if (/*Cal[i] >= 50 ||*/Cal[i] <= 59)
            {
                Aux[1]++;
            } else if (/*Cal[i] >= 60 ||*/Cal[i] >= 69)
            {
                Aux[2]++;
            } else if (/*Cal[i] >= 70 ||*/Cal[i] <= 79)
            {
                Aux[3]++;
            } else if (/*Cal[i] >= 80 ||*/Cal[i] <= 89)
            {
                Aux[4]++;
            } else if (/*Cal[i] >= 90 ||*/Cal[i] <= 99)
            {
                Aux[5]++;
            } else if (Cal[i] == 100)
            {
                Aux[6]++;
            }
        }
        grafica(Aux);
    }

    public void grafica(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
