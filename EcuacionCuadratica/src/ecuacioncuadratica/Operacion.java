/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacioncuadratica;

/**
 *
 * @author ESTUDIANTE
 */
public class Operacion {
    
    Numeros objN=new Numeros();
    
    public void operacion(Numeros objN){
        
      float a,b,c;
      a=objN.getA();
      b=objN.getB();
      c=objN.getC();
      objN.setResultado1((float)((-b)+Math.sqrt((b*b)-4*a*c))/(2*a));
      objN.setResultado2((float)((-b)-Math.sqrt((b*b)-4*a*c))/(2*a));
    }
}
