package eva1_13_alcance;

public class EVA1_13_ALCANCE {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100; //lo que se declara en el main si es visible para todo lo que esté dentro del main (no aplica caso contrario)
        for (int i = 0; i < 10; i++) {//inicio del bloque for

            System.out.println("x = " + x);
            System.out.println("i = " + i);
            //System.out.println("j = " + j); //variable no declarada
            int j = 100; //a partir e aqui es visible
            System.out.println("j = " + j);
            {
                int z = 100;
                System.out.println("z = " + z);
            }
            //System.out.println("z = " + z); //no esta declarada fuera de las llaves
        }
        //System.out.println("i = " + i); //no esta declarada fuera del for
        //System.out.println("j = " + j); //no esta declarada fuera del for
    }

    public static void algo(){
        //System.out.println("x = "+ x); //variable no encontrada fuera del main
    }
}
