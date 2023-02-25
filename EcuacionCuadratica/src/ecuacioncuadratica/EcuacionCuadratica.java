
package ecuacioncuadratica;

public class EcuacionCuadratica {

    public static void main(String[] args) {
      Numeros objN=new Numeros();
      GetDatos objD=new GetDatos();
      Operacion objO=new Operacion();
      Resultado objR=new Resultado();
      objN.setA(objD.getNumeros());
      objN.setB(objD.getNumeros());
      objN.setC(objD.getNumeros());
      objO.operacion(objN);
      objR.mostrar(objN);

    }
    
}
