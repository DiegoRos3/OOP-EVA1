package eva1_17_sobrecarga_areas;

public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area circulo: " + area(4));
        System.out.println("Area triangulo:" + area(4, 4));
        System.out.println("Area trapecio: " + area(4, 4, 4));
    }
    
                    //area(double) = circulo
    public static double area(double radio){
        double area = (3.1416 * radio * radio);
        return area;
    }
                    //area(double,double) = triangulo
    public static double area(double base, double altura){
        double area = ((base * altura) / 2);
        return area;
    }
    
                    //area(double,double,double) = trapecio
    public static double area(double basemenor,double basemayor, double altura){
        double area = (((basemenor + basemayor) * altura) / 2);
        return area;
    }
    
}
