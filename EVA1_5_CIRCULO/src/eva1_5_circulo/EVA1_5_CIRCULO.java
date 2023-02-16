package eva1_5_circulo;
import java.lang.Math;
        
public class EVA1_5_CIRCULO {

    public static void main(String[] args) {
        // Instanciacion circulo 1
        Circulo circulo1 = new Circulo();
        
        //metodo set para recibir el radio
        circulo1.setRadio(6);
        System.out.println("El area es: " + circulo1.calculoArea());
        System.out.println("El perimetro es: " + circulo1.calculoPerimetro());
        
    }
    
}
