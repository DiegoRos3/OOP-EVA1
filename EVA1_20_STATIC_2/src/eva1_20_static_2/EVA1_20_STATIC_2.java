package eva1_20_static_2;

public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*final int x;
        x = 100;
        x = 200;*/
        FormulasGeometria formulas = new FormulasGeometria();
        //formulas. no eciste ningun metodo dentro del objeto
        System.out.println("PI: "+FormulasGeometria.PI);
        System.out.println("Area triangulo: " + FormulasGeometria.areaTriangulo(2, 3));
        System.out.println("Volumen esfera: "+ FormulasGeometria.volumenEsfera(10));
    }
    
}
