package eva1_4_tv;

public class Tv {

    //atributos de la clase --> ESTADO
    private int volumen;
    private int canal;
    private boolean poder;

    //constructres
    public Tv() { //constructor default
        volumen = 0;
        canal = 0;
        poder = false; //falso es apagado
    }

    //metodos
    //encender y apagar la TV
    public void cambiarEstadoPoder() {
        //verificar estado de la tv
        if (poder == true) {
            poder = false;
            System.out.println("Apagando pantalla");
        } else {
            poder = true;
            System.out.println("Encendiendo pantalla");
        }
    }

    //volumen
    public void subirVolumen() {
        if (poder == true) {  //if (poder) la tv esta prendida
            if (volumen < 100) {
                volumen++;
                System.out.println("Volumen: " + volumen);
            }
        } else {
            System.out.println("La pantalla esta apagada, no se puede ejecutar el volumen");
        }
    }

    public void bajarVolumen() {
        if (poder == true) { //if (poder) la tv esta prendida
            if (volumen > 0) {
                volumen--;
                System.out.println("Volumen: " + volumen);
            }
        } else {
            System.out.println("La pantalla esta apagada, no se puede ejecutar el volumen");
        }
    }
        //canal        
    public void subirCanal() {
        if (poder == true) {  //if (poder) la tv esta prendida
            //si pasa de 100, esta pasara a 0
            canal++; //acomulador
            if (canal > 100) {
                canal = 0;
            }
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("La pantalla esta apagada, no se puede ejecutar el canal");
        }
    }

    public void bajarCanal() {
        if (poder == true) {  //if (poder) la tv esta prendida
            //si pasa de 0, esta empezara en 100
            canal--;
            if (canal < 0) {
                canal = 100;
            }
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("La pantalla esta apagada, no se puede ejecutar el canal");
        }
    }
}
