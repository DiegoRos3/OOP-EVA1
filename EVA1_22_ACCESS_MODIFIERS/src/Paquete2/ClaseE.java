package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba() {

        ClaseA objA = new ClaseA();
//        objA.publicA; atributos visibles

//      Clase B es invisible por ser clase default y estar en otro paquete
//      ClaseB objB = new ClaseB();

        ClaseC objC = new ClaseC();
//        objC.publicC; atributos visibles

//          En la clase D pasa lo mismo que con la clase B
//        ClaseD objD = new ClaseD();
//        objD.publicD; atributos visibles


//      Hay que agregar la clausula "import"
        ClaseD objD = new ClaseD();
//        objE.publicE; atributos visibles
//        objE.defaultE;
    }
}

class ClaseD{
    public int publicE;
    int defaultE;
    private int privateE;
}