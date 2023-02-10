package eva1_2_clases_java;

public class EVA1_2_CLASES_JAVA {

    public static void main(String[] args) {        
        //Instanciacion
        //1. Declarar el identificador del objeto
        //2. Asignar memoria con new
        //3. Invocar su constructor
        //Persona() --> constructor
        //constructor --> metodo

        Persona perso1 = new Persona();
        /*ESTA SECCION ES PORQUE INICIAMOS CON ATRIBUTOS DEFAULT
        
        perso1.nombre = "Ruben";
        perso1.apellido = "Hernandez";
        perso1.edad = 41;
        perso1.estadoCivil = true; true es casado 
        
        System.out.println(perso1.nombre); */

        perso1.setNombre("Ruben Alonso");
        perso1.setApellido("Hernandez Chavez");
        perso1.setEdad(41);
        perso1.setEstadoCivil(true);

        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());*/        
        perso1.imprimirDatos();
        
        //PERSONA 2
        
        Persona perso2 = new Persona();
        perso2.setNombre("Diego Aaron");
        perso2.setApellido("Rose Aguirre");
        perso2.setEdad(18);
        perso2.setEstadoCivil(false);
        
        perso2.imprimirDatos();
    }

}
