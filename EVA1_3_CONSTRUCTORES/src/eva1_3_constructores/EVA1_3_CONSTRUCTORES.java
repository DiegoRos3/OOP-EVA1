package eva1_3_constructores;

public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        // Crear cuentas bancarias usando una clase

        //Cuenta 1
        CuentaBancaria cuen1 = new CuentaBancaria("1", 40000000, "Carlos Slim");//usar el constructor 2 te ayuda a escribirlo mas rapido
        //Capturamos datos:
        /*cuen1.setNomCliente("Diego Rose");
        cuen1.setNumCuenta("22550309");
        cuen1.setSaldo(76486.50);*/

 /*System.out.println("DATOS DEL CLIENTE: ");
        String nombre= cuen1.getNomCliente(); //le añadimos una variable al metodo get del nombre
        System.out.println(nombre);
        System.out.println(cuen1.getNumCuenta()); //tambien se puede imprimir directo con el metodo get
        System.out.println(cuen1.getSaldo()); */
 
        //Cuenta 2
        CuentaBancaria cuen2 = new CuentaBancaria("2", 3000, "Diego Rose");
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuen2.getNomCliente());
        System.out.println(cuen2.getNumCuenta());
        System.out.println(cuen2.getSaldo());
        
        System.out.println("");
        
        //Cuenta 3
        CuentaBancaria cuen3 = new CuentaBancaria("3", 400, "Ana Aguirre");
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuen3.getNomCliente());
        System.out.println(cuen3.getNumCuenta());
        System.out.println(cuen3.getSaldo());

    }

}
