package Paquete1;

import Paquete2.ClaseE;

public class ClaseA {

    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba() {
        ClaseB objB = new ClaseB();
//        objB.publicB; atributos visibles
//        objB.defaultB;

        ClaseC objC = new ClaseC();
//        objC.publicC; atributos visibles
//        objC.defaultC;

//      Clase D es defalut en otro archvo, pero mismo paquete
        ClaseD objD = new ClaseD();
//        objD.publicD; atributos visibles
//        objD.defaultD;

//      Clase E esta en otro paquete y archivo
//      Hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
//        objE.publicE; atributos visibles
//        objE.defaultE;

//      Clase F es default y es invisible para las clases de este paquete1
//      ClaseF objF = new ClaseF();
    }

}

class ClaseB {

    public int publicB;
    int defaultB;
    private int privateB;
}
