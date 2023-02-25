/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacioncuadratica;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class GetDatos {
    
       public float getNumeros(){
           float Numero;
           System.out.println("ingrese un numero: ");
           Scanner sc=new Scanner(System.in);
           Numero=sc.nextFloat();
           return Numero;
       }
    
    
}
