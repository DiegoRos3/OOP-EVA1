package eva1_20_static_2;

public class FormulasGeometria {
    //CONSTANTE: publico, estatico, final (No cambia de valor), tipo de dato
    public static final double PI = 3.14159;
    
    //area
    public static double areaTriangulo(double base, double altura){
    return (base * altura) / 2;
}
    public static double areaCirculo(double radio){
    return PI * radio * radio;
}
    public static double perimetroCirculo(double radio){
    return PI * (radio * 2);
    }
    
    public static double volumenEsfera(double radio){
    return (4/3) * PI * (radio * radio);
}
    
}
