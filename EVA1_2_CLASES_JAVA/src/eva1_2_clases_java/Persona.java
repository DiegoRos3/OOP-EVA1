package eva1_2_clases_java;

public class Persona {

    //atributos de la clase --> ESTADO
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;

    //metodos: comportamiento
    //lectura y escritura de atributos:
    //Metodos get--> leer, metodo set-->escribir
    //metodos:
    //modificador valor de retorno nombre(argumentos) (implementacion)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public boolean getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean valor) {
        estadoCivil = valor;
    }

    public void imprimirDatos(){
        System.out.println("Datos almacenados: ");
        //concatenación = suma numeros ó concatena texto <- sobrecarga de operadores
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        if (estadoCivil)
            System.out.println("Estado civil: Casado");
        else
            System.out.println("Estado civil: Soltero");
                    
    }
}
