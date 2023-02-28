package eva1_19_static;

public class EVA1_19_STATIC {

    public static void main(String[] args) {
        // STATIC: algo que podemos usar sin crear instancias de una clase
        System.out.println("PI: " + Math.PI);
        System.out.println("Numero aleatorio: " + Math.random());
        Utilerias utilerias = new Utilerias();
        utilerias.saludo();
        Utilerias.otroSaludo();
      //Saludo2(); si no es estatico y no se ha creado un objeto, el metodo no existe
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
}

class Utilerias {

    //Saludo(): Este metodo existe hasta que se crea un objeto de la case.
    //Solo se usa a tavez de un objeto
    public void saludo() {
        System.out.println("Hola!");
    }

    //otroSaludo(): Este metodo existe en el momento en el que el programa
    //inicia su ejecucion. No necesita que se cree un objeto de la clase para
    //poderlo utilizar. Se usa a travez de la clase
    public static void otroSaludo() {
        System.out.println("otro hola (static)");
    }
}

class otaClase {

}
