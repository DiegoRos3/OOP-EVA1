package eva1_18_sobrecarga_rfc;

public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
        // TODO code application logic here
        //generarRFC("Diego", "Rose", "Aguirre", 2004,12, 23);
        System.out.println("RFC: " + generarRFC("diego", "rose", "aguirre", 2004,12, 23));
        System.out.println("RFC: "+ generarRFC("diego", "rose", 2004, 12, 23));
        System.out.println("RFC: "+ generarRFC("diego", 2004, 12, 23));
    }
    
    //RFC completo
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
    String apP1 = apPat.charAt(0) + "";
    String apP2 = apPat.charAt(1) + "";
    String apM = apMat.charAt(0) + "";
    String nom = nombre.charAt(0) + "";
    String rfc = apP1 + apP2 +apM + nom + año + mes + dia + "";
    return rfc;
}
    
    //RFC 1 apellido
    public static String generarRFC(String nombre, String ap, int año, int mes, int dia){
    String x = "x";
    String apP1 = ap.charAt(0) + "";
    String apP2 = ap.charAt(1) + "";
    String nom = nombre.charAt(0) + "";
    String rfc = apP1 + apP2 + x + nom + año + mes + dia + "";
    return rfc;
}
    
    //RFC ningun apellido
    public static String generarRFC(String nombre, int año, int mes, int dia){
    String x = "x";
    String nom = nombre.charAt(0) + "";
    String rfc = x + x + nom + año + mes + dia + "";
    return rfc;
}

}
