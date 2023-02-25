/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacioncuadratica;

/**
 *
 * @author victo
 */
public class Resultado {
    public void mostrar(Numeros objN){
      float a;
      a=objN.getA();
      if(a==0){
        System.out.println("No se puede realizar intente de nuevo");
      }else{
        System.out.println("R1: "+(float)objN.getResultado1());
        System.out.println("R2: "+(float)objN.getResultado2());
      }
    }
}
