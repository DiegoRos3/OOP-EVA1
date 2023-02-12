package eva1_3_constructores;

public class CuentaBancaria {
    //Atributos de la clase
    private String numCuenta;
    private double saldo;
    private String nomCliente;
    
    //Constructores:
    //Default y con argumentos
    public CuentaBancaria(){ //el constructor es con el nombre de la clase. es default 
    nomCliente = "---"; //los constructores son el punto de partida para los objetos
    numCuenta = "---";
    saldo = 0;
    }
    
    public CuentaBancaria(String nCuenta,double otroSaldo, String nCliente){ //defines como argumento las variables y su tipo de dato para tener constructores con el mismo nombre
        numCuenta = nCuenta;
        saldo = otroSaldo;
        nomCliente = nCliente;                
    }
    
    //Comportamientos
    //Metodos: get y set    
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String valor) {
        numCuenta = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        saldo = valor;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String valor) {
        nomCliente = valor;
    }
}
