package Paquete1;

import Paquete2.ClaseE;

public class ClaseC {

    public int publicC;
    int defaultC;
    private int privateC;

    public void prueba() {

        ClaseA objA = new ClaseA();
//        objA.publicA; atributos visibles
//        objA.defaultA;

        ClaseB objB = new ClaseB();
//        objB.publicB; atributos visibles
//        objB.defaultB;

        ClaseD objD = new ClaseD();
//        objD.publicD; atributos visibles
//        objD.defaultD;

//      Hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
//        objE.publicE; atributos visibles
//        objE.defaultE;
    }

}

class ClaseD {

    public int publicD;
    int defaultD;
    private int privateD;
}
