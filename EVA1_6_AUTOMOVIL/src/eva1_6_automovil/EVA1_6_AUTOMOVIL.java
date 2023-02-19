package eva1_6_automovil;

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        // Calcular el adeudo de un automovil dependiendo del año
        
        //Instanciacion para objeto con constructor con argumentos
        Automovil auto1 = new Automovil("ford", "fiesta", 22550309, 2022, "Diego Rose");        
        auto1.calcularAdeudo();
        
        //Constructor default con get y set
        Automovil auto2 = new Automovil();
        auto2.setMarca("Nissan");
        auto2.setModelo("tsuru");
        auto2.setPlaca(2245102);
        auto2.setAño(1990);
        auto2.setDueño("Juan Escutia");
        auto2.calcularAdeudo();
        
        
        
    }
    
}
