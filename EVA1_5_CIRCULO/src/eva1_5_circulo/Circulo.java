package eva1_5_circulo;
import java.lang.Math;

public class Circulo {
//atributos

    private double area;
    private double perimetro;
    private double radio;
    public double pi;

    //constructor default
    public Circulo() {
        area = 0;
        perimetro = 0;
        radio = 0;
        pi = Math.PI;
    }
        
    //metodos
    public void setRadio(double valor) {
        radio = valor;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double calculoArea() {
        area = pi * Math.pow(radio, 2);
        return area;
    }

    public double calculoPerimetro() {
        perimetro = 2 * pi * radio;
        return perimetro;
    }
    
}
