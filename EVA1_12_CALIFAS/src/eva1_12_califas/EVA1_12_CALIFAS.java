package eva1_12_califas;

public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        // TODO code application logic here
        String res = califas(92);
        System.out.println("La calificacion es: " + res);
    }

    public static String califas(int califa) {
        if ((califa >= 91) && (califa <= 100)) {
            return "A";
        } else if (califa >= 81 && califa < 91) {
            return "B";
        } else if (califa >= 71 && califa < 81) {
            return "C";
        } else {
            return "D";
        }
    }
}
